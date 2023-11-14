package guru.furu.thothKT

fun String.convertGlyphs(): String = HieroglyphConverterImpl().convert(this).glyphs