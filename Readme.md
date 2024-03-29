# ThothKT 𓁟

Converts special sequences of characters into Egyptian Hieroglyphic. 

## Purpose

Writing Ancient Egyptian Hieroglyphic text is tough on modern computers. This library aims to make it just a little bit easier.

ThothKT accepts sequences of ASCII/Unicode characters that represent individual hieroglyphs. Currently, three different formats are accepted:

NOTE: You can freely mix the input types within the same line, as long as each is separated by a space. Both the Unicode values and Gardiner sign list values can be found at https://en.wikipedia.org/wiki/List_of_Egyptian_hieroglyphs.

## Sample

```
val converter: HieroglyphConverter = HieroglyphConverterImplV2()

val inputString = "*Z2B TA #13000 *V33A"

val result: DecodedGlyphs = converter.convert(inputString)

assertEquals(result.glyphs, "𓏧𓅷𓀀𓎥")
```

There's also a shortcut String extension function:

```
val inputString = "*Z2B TA #13000 *V33A"

val result: String = inputString.convertToGlyphs()

assertEquals(result, "𓏧𓅷𓀀𓎥")
```

## Input types

### Raw Unicode codepoints

Prefix each unicode codepoint with a `#`.
Usage Example:

`#13000 -> 𓀀`

### Gardiner Sign List letter classifications

Wrap each letter classification preceded by a *.
Usage Example:

`*A5A -> 𓀅`

### Library-specific custom format (phonetic-ish)

See the [CodeToGlyph.kt](https://github.com/RGrun/ThothKT/blob/master/src/commonMain/kotlin/guru/furu/thothKT/util/CodeToGlyph.kt) file for the complete list of codes.
The idea is for this to be the easiest input method once someone is familiar with the library. **These are subject to change until the library is more mature!**

Loosely based off the phonetic values of each glyph, the author has done his best to cobble together a system that makes some sort of sense.
The difficult part is reconciling the many different symbols that have the same or very similar phonetic values. This has necessitated placing numbers after the phonetic value to differentiate them.

The most common one used (in my personal experience) has no number, and other ones with the same phonetic values have incrementing numbers after them starting with 2.

For example:

`"y" to "𓇌",
"y2" to "𓏭",`

This is not ideal, but this library is still a work-in-progress, and I will change these as time goes on.
They will be standardized one day, but until then please forgive my somewhat arbitrary and fickle assignments.

Unilaterals, bilaterals and trilaterals are all supported.

Additionally, please note that this library uses the computer encoding for the phonetic input described below.

Valid characters are as follows: `AaiywWbpfmMnNrlhHxXzsSqkgtTdD`.

Usage Example:

`a X D TA tyw DHwty -> 𓂝𓄡𓆓𓅷𓅂𓁟`

### Version History:

- V1 (v1.0.0): Original Release
- V2 (v1.0.7): Major update to the CodeToGlyph mapping (V2 version of the file). Changed the notation for the Gardiner codes from [square brackets] to a *preceding star.

#### Targets:

- JVM
