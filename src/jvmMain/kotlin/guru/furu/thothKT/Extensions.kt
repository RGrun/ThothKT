package guru.furu.thothKT

fun String.convertToGlyphs(): String = HieroglyphConverterImpl().convert(this).glyphs