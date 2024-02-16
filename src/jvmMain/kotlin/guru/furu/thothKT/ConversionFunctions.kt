package guru.furu.thothKT

import guru.furu.thothKT.model.GlyphSubcategory
import java.util.*

internal class ConversionFunctions {
    companion object {
        private val computerEncodingCharactersRegex = "[AaiywWbpfmMnNrlhHxXzsSqkgtTdD]".toRegex()

        internal fun convertGardinerSign(glyph: String, sb: StringBuilder) {
            /*
             * Cases:
             * A44 -> categoryCode + number
             * A45A -> categoryCode + number + secondaryIndex
             *
             * Note:
             * "Aa", "NU" and "NL" are valid categoryCodes.
             */
            var rawGardinerSign = glyph
            var secondaryIndex = '0'

            // check for secondaryIndex
            if (rawGardinerSign.toCharArray().last().isLetter()) {
                secondaryIndex = rawGardinerSign.takeLast(1).toCharArray().first()
                rawGardinerSign = rawGardinerSign.take(rawGardinerSign.length - 1)

                if (secondaryIndex > 'L') {
                    // L is the last valid secondaryIndex
                    throw GlyphConvertException("Secondary Index $secondaryIndex is invalid.")
                }
            }

            val number: Int
            val categoryCode: String

            if (rawGardinerSign.startsWith("Aa") ||
                rawGardinerSign.startsWith("NU") ||
                rawGardinerSign.startsWith("NL")
            ) {
                // special case
                categoryCode = rawGardinerSign.take(2)
                number = Integer.parseInt(rawGardinerSign.substring(2, rawGardinerSign.length))
            } else {
                categoryCode = rawGardinerSign.take(1).uppercase(Locale.ENGLISH)
                number = Integer.parseInt(
                    if (rawGardinerSign.length == 2) rawGardinerSign.takeLast(1) else rawGardinerSign.takeLast(2)
                )
            }

            var curGlyphHexValue = _categoryStartLocations[categoryCode] ?: throw GlyphConvertException("Invalid categoryCode: $categoryCode")
            var nextSubLocation = 0

            val curCategory = _gardinerCategories[categoryCode] ?: throw GlyphConvertException("Invalid category code $categoryCode")
            val nextCategoryCode = nextCategory(categoryCode)

            // category Aa has 34 glyphs
            val catDiff = if (nextCategoryCode == "end") {
                34
            } else {
                _categoryStartLocations[nextCategoryCode]!! - _categoryStartLocations[categoryCode]!!
            }

            var curSC: GlyphSubcategory.SubcategoryLocation = if (curCategory.locations.isEmpty()) {
                // special case for categories K and Q since they have no subcategories
                GlyphSubcategory.SubcategoryLocation(
                    start = 0,
                    length = catDiff
                )
            } else {
                curCategory.locations[nextSubLocation]
            }

            var locInCategory = 1
            while (locInCategory <= catDiff) {
                if (locInCategory == number && locInCategory != curSC.start) {
                    break
                }

                if (locInCategory == curSC.start) {
                    if (locInCategory == number) {
                        if (secondaryIndex == '0') {
                            break
                        }

                        // scan forward
                        var curChar = 'A'
                        while (curChar != secondaryIndex) {
                            curChar++
                            curGlyphHexValue++
                        }
                        curGlyphHexValue++
                        break
                    } else {
                        curGlyphHexValue += curSC.length + 1

                        if (nextSubLocation + 1 >= curCategory.locations.size) {
                            locInCategory++
                            continue
                        }

                        curSC = curCategory.locations[++nextSubLocation]

                        locInCategory++
                        continue
                    }
                }

                locInCategory++
                curGlyphHexValue++
            }
            sb.appendCodePoint(curGlyphHexValue)
        }

        internal fun checkForComputerEncoding(glyph: String): Boolean =
            computerEncodingCharactersRegex.containsMatchIn(glyph)

        internal fun handleRawUnicodeInput(glyph: String, sb: StringBuilder) {
            val uValue: Int = glyph.takeLast(glyph.length - 1).toInt(16)

            if (uValue !in 0x13000..0x1342E) {
                throw GlyphConvertException("Unicode code point not in valid range. ($uValue)")
            }

            sb.appendCodePoint(uValue)
        }

        private fun nextCategory(curCategory: String): String =
            when (curCategory) {
                "I" -> "K"
                "N" -> "NL"
                "NL" -> "NU"
                "NU" -> "O"
                "Z" -> "Aa"
                "Aa" -> "end"
                else -> {
                    val nextCat = curCategory[0]
                    String(charArrayOf(nextCat + 1))
                }
            }
    }
}
