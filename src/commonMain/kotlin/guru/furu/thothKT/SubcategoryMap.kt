package guru.furu.thothKT

import guru.furu.thothKT.model.GlyphSubcategory
import guru.furu.thothKT.model.GlyphSubcategory.SubcategoryLocation

val _categoryStartLocations = mapOf<String, Int>(
    "A" to 0x13000,
    "B" to 0x13050,
    "C" to 0x1305A,
    "D" to 0x13076,
    "E" to 0x130D2,
    "F" to 0x130FE,
    "G" to 0x1313F,
    "H" to 0x1317F,
    "I" to 0x13188, // why is there no category J?
    "K" to 0x1319B,
    "L" to 0x131A3,
    "M" to 0x131AD,
    "N" to 0x131EF,
    "NL" to 0x13220,
    "NU" to 0x13236,
    "O" to 0x13250,
    "P" to 0x1329B,
    "Q" to 0x132A8,
    "R" to 0x132AF,
    "S" to 0x132D1,
    "T" to 0x13307,
    "U" to 0x13333,
    "V" to 0x13362,
    "W" to 0x133AF,
    "X" to 0x133CF,
    "Y" to 0x133DB,
    "Z" to 0x133E4,
    "Aa" to 0x1340D
)


val _gardinerCategories = mapOf<String, GlyphSubcategory>(
    "A" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 5, length = 1
            ),
            SubcategoryLocation(
                start = 6, length = 2
            ),
            SubcategoryLocation(
                start = 14, length = 1
            ),
            SubcategoryLocation(
                start = 17, length = 1
            ),
            SubcategoryLocation(
                start = 32, length = 1
            ),
            SubcategoryLocation(
                start = 40, length = 1
            ),
            SubcategoryLocation(
                start = 42, length = 1
            ),
            SubcategoryLocation(
                start = 43, length = 1
            ),
            SubcategoryLocation(
                start = 45, length = 1
            ),
        )
    ),

    "B" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 5, length = 1
            ),
        )
    ),

    "C" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 2, length = 3
            ),
            SubcategoryLocation(
                start = 10, length = 1
            ),
        )
    ),

    "D" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 8, length = 1
            ),
            SubcategoryLocation(
                start = 27, length = 1
            ),
            SubcategoryLocation(
                start = 31, length = 1
            ),
            SubcategoryLocation(
                start = 34, length = 1
            ),
            SubcategoryLocation(
                start = 46, length = 1
            ),
            SubcategoryLocation(
                start = 48, length = 1
            ),
            SubcategoryLocation(
                start = 50, length = 9
            ),
            SubcategoryLocation(
                start = 52, length = 1
            ),
            SubcategoryLocation(
                start = 67, length = 8
            ),
        )
    ),

    "E" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 8, length = 1
            ),
            SubcategoryLocation(
                start = 9, length = 1
            ),
            SubcategoryLocation(
                start = 17, length = 1
            ),
            SubcategoryLocation(
                start = 20, length = 1
            ),
            SubcategoryLocation(
                start = 28, length = 1
            ),
            SubcategoryLocation(
                start = 34, length = 1
            ),
        )
    ),

    "F" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 1, length = 1
            ),
            SubcategoryLocation(
                start = 13, length = 1
            ),
            SubcategoryLocation(
                start = 21, length = 1
            ),
            SubcategoryLocation(
                start = 31, length = 1
            ),
            SubcategoryLocation(
                start = 37, length = 1
            ),
            SubcategoryLocation(
                start = 38, length = 1
            ),
            SubcategoryLocation(
                start = 45, length = 1
            ),
            SubcategoryLocation(
                start = 47, length = 1
            ),
            SubcategoryLocation(
                start = 51, length = 3
            ),
        )
    ),

    "G" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 6, length = 1
            ),
            SubcategoryLocation(
                start = 7, length = 2
            ),
            SubcategoryLocation(
                start = 11, length = 1
            ),
            SubcategoryLocation(
                start = 20, length = 1
            ),
            SubcategoryLocation(
                start = 26, length = 1
            ),
            SubcategoryLocation(
                start = 37, length = 1
            ),
            SubcategoryLocation(
                start = 43, length = 1
            ),
            SubcategoryLocation(
                start = 45, length = 1
            ),
        )
    ),

    "H" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 5, length = 1
            ),
            SubcategoryLocation(
                start = 9, length = 1
            ),
            SubcategoryLocation(
                start = 10, length = 1
            ),
        )
    ),

    "I" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 5, length = 1
            ),
            SubcategoryLocation(
                start = 9, length = 1
            ),
            SubcategoryLocation(
                start = 10, length = 1
            ),
            SubcategoryLocation(
                start = 11, length = 1
            ),
        )
    ),

    "K" to GlyphSubcategory(
        locations = listOf(
        )
    ),

    "L" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 2, length = 1
            ),
            SubcategoryLocation(
                start = 6, length = 1
            ),
        )
    ),

    "M" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 1, length = 1
            ),
            SubcategoryLocation(
                start = 3, length = 1
            ),
            SubcategoryLocation(
                start = 10, length = 1
            ),
            SubcategoryLocation(
                start = 12, length = 1
            ),
            SubcategoryLocation(
                start = 15, length = 1
            ),
            SubcategoryLocation(
                start = 16, length = 1
            ),
            SubcategoryLocation(
                start = 17, length = 1
            ),
            SubcategoryLocation(
                start = 22, length = 1
            ),
            SubcategoryLocation(
                start = 31, length = 1
            ),
            SubcategoryLocation(
                start = 33, length = 2
            ),
            SubcategoryLocation(
                start = 40, length = 1
            ),
       )
    ),

    "N" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 18, length = 2
            ),
            SubcategoryLocation(
                start = 25, length = 1
            ),
            SubcategoryLocation(
                start = 33, length = 1
            ),
            SubcategoryLocation(
                start = 34, length = 1
            ),
            SubcategoryLocation(
                start = 35, length = 1
            ),
            SubcategoryLocation(
                start = 37, length = 1
            ),
        )
    ),

    "NL" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 17, length = 1
            ),
       )
    ),

    "NU" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 10, length = 1
            ),
            SubcategoryLocation(
                start = 11, length = 1
            ),
            SubcategoryLocation(
                start = 18, length = 1
            ),
       )
    ),

    "O" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 1, length = 1
            ),
            SubcategoryLocation(
                start = 5, length = 1
            ),
            SubcategoryLocation(
                start = 6, length = 6
            ),
            SubcategoryLocation(
                start = 10, length = 3
            ),
            SubcategoryLocation(
                start = 19, length = 1
            ),
            SubcategoryLocation(
                start = 24, length = 1
            ),
            SubcategoryLocation(
                start = 25, length = 1
            ),
            SubcategoryLocation(
                start = 29, length = 4
            ),
            SubcategoryLocation(
                start = 30, length = 1
            ),
            SubcategoryLocation(
                start = 33, length = 1
            ),
            SubcategoryLocation(
                start = 36, length = 4
            ),
            SubcategoryLocation(
                start = 50, length = 2
            ),
       )
    ),

    "P" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 1, length = 1
            ),
            SubcategoryLocation(
                start = 3, length = 2
            ),
       )
    ),

    "Q" to GlyphSubcategory(
        locations = listOf(
        )
    ),

    "R" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 3, length = 2
            ),
            SubcategoryLocation(
                start = 10, length = 1
            ),
            SubcategoryLocation(
                start = 16, length = 1
            ),
       )
    ),

    "S" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 2, length = 1
            ),
            SubcategoryLocation(
                start = 6, length = 1
            ),
            SubcategoryLocation(
                start = 14, length = 2
            ),
            SubcategoryLocation(
                start = 17, length = 1
            ),
            SubcategoryLocation(
                start = 26, length = 2
            ),
            SubcategoryLocation(
                start = 35, length = 1
            ),
        )
    ),

    "T" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 3, length = 1
            ),
            SubcategoryLocation(
                start = 7, length = 1
            ),
            SubcategoryLocation(
                start = 8, length = 1
            ),
            SubcategoryLocation(
                start = 9, length = 1
            ),
            SubcategoryLocation(
                start = 11, length = 1
            ),
            SubcategoryLocation(
                start = 16, length = 1
            ),
            SubcategoryLocation(
                start = 33, length = 1
            ),
        )
    ),

    "U" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 6, length = 2
            ),
            SubcategoryLocation(
                start = 23, length = 1
            ),
            SubcategoryLocation(
                start = 29, length = 1
            ),
            SubcategoryLocation(
                start = 32, length = 1
            ),
        )
    ),

    "V" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 1, length = 9
            ),
            SubcategoryLocation(
                start = 2, length = 1
            ),
            SubcategoryLocation(
                start = 7, length = 2
            ),
            SubcategoryLocation(
                start = 11, length = 3
            ),
            SubcategoryLocation(
                start = 12, length = 2
            ),
            SubcategoryLocation(
                start = 20, length = 12
            ),
            SubcategoryLocation(
                start = 23, length = 1
            ),
            SubcategoryLocation(
                start = 28, length = 1
            ),
            SubcategoryLocation(
                start = 29, length = 1
            ),
            SubcategoryLocation(
                start = 30, length = 1
            ),
            SubcategoryLocation(
                start = 31, length = 1
            ),
            SubcategoryLocation(
                start = 33, length = 1
            ),
            SubcategoryLocation(
                start = 37, length = 1
            ),
            SubcategoryLocation(
                start = 40, length = 1
            ),
        )
    ),

    "W" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 3, length = 1
            ),
            SubcategoryLocation(
                start = 9, length = 1
            ),
            SubcategoryLocation(
                start = 10, length = 1
            ),
            SubcategoryLocation(
                start = 14, length = 1
            ),
            SubcategoryLocation(
                start = 17, length = 1
            ),
            SubcategoryLocation(
                start = 18, length = 1
            ),
            SubcategoryLocation(
                start = 24, length = 1
            ),
        )
    ),

    "X" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 4, length = 2
            ),
            SubcategoryLocation(
                start = 6, length = 1
            ),
            SubcategoryLocation(
                start = 8, length = 1
            ),
        )
    ),

    "Y" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 1, length = 1
            ),
        )
    ),

    "Z" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 2, length = 4
            ),
            SubcategoryLocation(
                start = 3, length = 2
            ),
            SubcategoryLocation(
                start = 4, length = 1
            ),
            SubcategoryLocation(
                start = 55, length = 1
            ),
            SubcategoryLocation(
                start = 15, length = 9
            ),
            SubcategoryLocation(
                start = 16, length = 8
            ),
        )
    ),

    "Aa" to GlyphSubcategory(
        locations = listOf(
            SubcategoryLocation(
                start = 7, length = 2
            ),
       )
    ),
)
