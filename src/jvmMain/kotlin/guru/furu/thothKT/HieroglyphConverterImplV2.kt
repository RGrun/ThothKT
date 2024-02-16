package guru.furu.thothKT

import guru.furu.thothKT.ConversionFunctions.Companion.checkForComputerEncoding
import guru.furu.thothKT.ConversionFunctions.Companion.convertGardinerSign
import guru.furu.thothKT.ConversionFunctions.Companion.handleRawUnicodeInput
import guru.furu.thothKT.model.DecodedGlyphs
import guru.furu.thothKT.util.codeToGlyphMapV2

class HieroglyphConverterImplV2 : HieroglyphConverter {
    override fun convert(input: String): DecodedGlyphs {
        val split = input.split(' ')
        val sb = StringBuilder()

        split.forEach { glyph ->

            if (glyph.isEmpty()) {
                return@forEach
            }

            when {
                glyph.startsWith('*') -> {
                    // handle Gardiner Sign List classification numbers
                    val unwrappedGlyph = glyph.drop(1)
                    convertGardinerSign(unwrappedGlyph, sb)
                }

                glyph.startsWith('#') -> {
                    // handle raw unicode input
                    handleRawUnicodeInput(glyph, sb)
                }

                checkForComputerEncoding(glyph) -> {
                    // handle computer encoding
                    val glyphLookup = codeToGlyphMapV2[glyph]
                        ?: throw GlyphConvertException("Computer encoded glyph either improper or not supported: $glyph")

                    glyphLookup.codePoints().forEach {
                        sb.appendCodePoint(it)
                    }
                }

                else -> {
                    // we can't process this
                    val errorMsg =
                        "Couldn't figure out what to do with the input: $glyph. Is it properly encoded? Check the Readme for examples of valid formats."
                    throw GlyphConvertException(errorMsg)
                }
            }
        }

        return DecodedGlyphs(sb.toString())
    }
}
