import guru.furu.thothKT.GlyphConvertException
import guru.furu.thothKT.HieroglyphConverterImplV2
import guru.furu.thothKT.convertToGlyphs
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class GlyphParseTestsV2 {
    companion object {
        val converter = HieroglyphConverterImplV2()
    }

    @Test
    fun `test computer encoded input`() {
        val input = "a X D TA tyw DHwty"
        val shouldBe = "𓂝𓄡𓆓𓅷𓅂𓁟"

        assertEquals(shouldBe, converter.convert(input).glyphs)
    }

    @Test
    fun `test raw unicode input`() {
        val input = "a X D TA #13000 #130D1 X a #1305F #13072"
        val shouldBe = "𓂝𓄡𓆓𓅷𓀀𓃑𓄡𓂝𓁟𓁲"

        assertEquals(shouldBe, converter.convert(input).glyphs)
    }

    @Test
    fun `test gardiner input`() {
        val input = "*K1 *Y1 *Z1 *I14 *A1 *N23 *Z2B *V20E *A5A *Aa1 *V33A"
        val shouldBe = "𓆛𓏛𓏤𓆙𓀀𓈇𓏧𓎋𓀅𓐍𓎥"

        assertEquals(shouldBe, converter.convert(input).glyphs)
    }

    @Test
    fun `test mixed input`() {
        val input = "*Z2B TA #13000 *V33A"
        val shouldBe = "𓏧𓅷𓀀𓎥"

        assertEquals(shouldBe, converter.convert(input).glyphs)
    }

    @Test
    fun `'the woman is beautiful' test`() {
        val input = "nfr f r Him t *B1 t n"
        val shouldBe = "𓄤𓆑𓂋𓈞𓏏𓁐𓏏𓈖"

        assertEquals(shouldBe, converter.convert(input).glyphs)
    }

    @Test
    fun `test String extension function`() {
        val input = "*Z2B TA #13000 *V33A"
        val shouldBe = "𓏧𓅷𓀀𓎥"

        assertEquals(shouldBe, input.convertToGlyphs())
    }

    @Test
    fun `test failure on invalid input`() {
        val input1 = "*Z2B TA #13000 V33A"
        val input2 = "*Z2B F #13000 *V33A"
        val input3 = "*Z2B TA 13000 *V33A"
        val input4 = "*Z2B TA #13000 V33A"
        val input5 = "*Z2B TA #13000 *V33Z"

        assertFailsWith<GlyphConvertException> { converter.convert(input1) }
        assertFailsWith<GlyphConvertException> { converter.convert(input2) }
        assertFailsWith<GlyphConvertException> { converter.convert(input3) }
        assertFailsWith<GlyphConvertException> { converter.convert(input4) }
        assertFailsWith<GlyphConvertException> { converter.convert(input5) }
    }
}
