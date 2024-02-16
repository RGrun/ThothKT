package guru.furu.thothKT

import guru.furu.thothKT.util.Version

fun String.convertToGlyphs(version: Version = Version.V2): String = when (version) {
    Version.V1 -> HieroglyphConverterImplV1().convert(this).glyphs
    Version.V2 -> HieroglyphConverterImplV2().convert(this).glyphs
}
