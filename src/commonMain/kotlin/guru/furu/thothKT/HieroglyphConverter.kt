package guru.furu.thothKT

import guru.furu.thothKT.model.DecodedGlyphs

expect interface HieroglyphConverter {
    fun convert(input: String): DecodedGlyphs
}
