package guru.furu.thothKT.model

data class GlyphSubcategory(
    val locations: List<SubcategoryLocation>
) {
    data class SubcategoryLocation(
        val start: Int,
        val length: Int
    )
}
