package guru.furu.thothKT

import guru.furu.thothKT.model.DecodedGlyphs

actual interface HieroglyphConverter {
    actual fun convert(input: String): DecodedGlyphs
}
