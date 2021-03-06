package burp

object FileTypes {
    /**
     * fileHeaders is a mapping of filetypes to their corresponding magic byte sequence.
     */
    @OptIn(ExperimentalUnsignedTypes::class)
    val fileHeaders = sequenceOf(
        "jpeg" to ubyteArrayOf(0xFFu, 0xD8u, 0xFFu, 0xDBu).toByteArray(),
        "exe" to ubyteArrayOf(0x4Du, 0x5Au).toByteArray(),
        "jpg.exe" to ubyteArrayOf(0x4Du, 0x5Au).toByteArray(),
        "pdf.exe" to ubyteArrayOf(0x4Du, 0x5Au).toByteArray(),
        "png.exe" to ubyteArrayOf(0x4Du, 0x5Au).toByteArray(),
        "php" to ubyteArrayOf(0x3cu, 0x3fu, 0x70u, 0x68u, 0x70u).toByteArray(),
        "php.jpg" to ubyteArrayOf(0x3cu, 0x3fu, 0x70u, 0x68u, 0x70u).toByteArray(),
        "jpg.php" to ubyteArrayOf(0x3cu, 0x3fu, 0x70u, 0x68u, 0x70u).toByteArray(),
        "pdf.php" to ubyteArrayOf(0x3cu, 0x3fu, 0x70u, 0x68u, 0x70u).toByteArray(),
        "png.php" to ubyteArrayOf(0x3cu, 0x3fu, 0x70u, 0x68u, 0x70u).toByteArray(),
        "elf" to ubyteArrayOf(0x7Fu, 0x45u, 0x4Cu, 0x46u).toByteArray(),
        "jpg.elf" to ubyteArrayOf(0x7Fu, 0x45u, 0x4Cu, 0x46u).toByteArray(),
        "pdf.elf" to ubyteArrayOf(0x7Fu, 0x45u, 0x4Cu, 0x46u).toByteArray(),
        "txt" to ubyteArrayOf(0xEFu, 0xBBu, 0xBFu).toByteArray(),
        "png" to ubyteArrayOf(0x89u, 0x50u, 0x4Eu, 0x47u, 0x0Du, 0x0Au, 0x1Au, 0x0Au).toByteArray(),
        "class" to ubyteArrayOf(0xCAu, 0xFEu, 0xBAu, 0xBEu).toByteArray(),
        "rar" to ubyteArrayOf(0x52u, 0x61u, 0x72u, 0x21u, 0x1Au, 0x07u, 0x01u, 0x00u).toByteArray(),
        "zip" to ubyteArrayOf(0x50u, 0x4Bu, 0x03u, 0x04u).toByteArray(),
        "empty.zip" to ubyteArrayOf(0x50u, 0x4Bu, 0x05u, 0x06u).toByteArray(),
        "spanned.zip" to ubyteArrayOf(0x50u, 0x4Bu, 0x07u, 0x08u).toByteArray(),
        "jar" to ubyteArrayOf(0x50u, 0x4Bu, 0x03u, 0x04u).toByteArray(),
        "jpg.jar" to ubyteArrayOf(0x50u, 0x4Bu, 0x03u, 0x04u).toByteArray(),
        "pdf.jar" to ubyteArrayOf(0x50u, 0x4Bu, 0x03u, 0x04u).toByteArray(),
        "png.jar" to ubyteArrayOf(0x50u, 0x4Bu, 0x03u, 0x04u).toByteArray(),
        "pcapng" to ubyteArrayOf(0x0au, 0x0du, 0x0du, 0x0au).toByteArray(),
        "rpm" to ubyteArrayOf(0xedu, 0xabu, 0xeeu, 0xdbu).toByteArray(),
        "sqlitedb" to ubyteArrayOf(
            0x53u,
            0x51u,
            0x4cu,
            0x69u,
            0x74u,
            0x65u,
            0x20u,
            0x66u,
            0x6fu,
            0x72u,
            0x6du,
            0x61u,
            0x74u,
            0x20u,
            0x33u,
            0x00u
        ).toByteArray(),
        "sh" to ubyteArrayOf(0x23u, 0x21u).toByteArray(), // #! characters
        "jpg.sh" to ubyteArrayOf(0x23u, 0x21u).toByteArray(), // #! characters
        "pdf.sh" to ubyteArrayOf(0x23u, 0x21u).toByteArray(), // #! characters
        "png.sh" to ubyteArrayOf(0x23u, 0x21u).toByteArray(), // #! characters
        "telegramdesktop" to ubyteArrayOf(0x54u, 0x44u, 0x46u, 0x24u).toByteArray(),
        "telegramdesktopencrypted" to ubyteArrayOf(0x54u, 0x44u, 0x45u, 0x46u).toByteArray(),
        "ico" to ubyteArrayOf(0x00u, 0x00u, 0x01u, 0x00u).toByteArray(),
        "bz2" to ubyteArrayOf(0x00u, 0x00u, 0x01u, 0x00u).toByteArray(),
        "gif" to ubyteArrayOf(0x47u, 0x49u, 0x46u, 0x38u, 0x39u, 0x61u).toByteArray(),
        "tiff" to ubyteArrayOf(0x4Du, 0x4Du, 0x00u, 0x2Au).toByteArray(),
        "raw" to ubyteArrayOf(0x49u, 0x49u, 0x2Au, 0x00u, 0x10u, 0x00u, 0x00u, 0x00u, 0x43u, 0x52u).toByteArray(),
        "cin" to ubyteArrayOf(0x80u, 0x2Au, 0x5Fu, 0xD7u).toByteArray(),
        "mach64" to ubyteArrayOf(0xFEu, 0xEDu, 0xFAu, 0xCFu).toByteArray(),
        "mach32" to ubyteArrayOf(0xFEu, 0xEDu, 0xFAu, 0xCEu).toByteArray(),
        "jks" to ubyteArrayOf(0xFEu, 0xEDu, 0xFEu, 0xEDu).toByteArray(),
        "ps" to ubyteArrayOf(0x25u, 0x21u, 0x50u, 0x53u).toByteArray(),
        "chm" to ubyteArrayOf(
            0x49u,
            0x54u,
            0x53u,
            0x46u,
            0x03u,
            0x00u,
            0x00u,
            0x00u,
            0x60u,
            0x00u,
            0x00u,
            0x00u
        ).toByteArray(),
        "jpg.chm" to ubyteArrayOf(
            0x49u,
            0x54u,
            0x53u,
            0x46u,
            0x03u,
            0x00u,
            0x00u,
            0x00u,
            0x60u,
            0x00u,
            0x00u,
            0x00u
        ).toByteArray(),
        "pdf.chm" to ubyteArrayOf(
            0x49u,
            0x54u,
            0x53u,
            0x46u,
            0x03u,
            0x00u,
            0x00u,
            0x00u,
            0x60u,
            0x00u,
            0x00u,
            0x00u
        ).toByteArray(),
        "png.chm" to ubyteArrayOf(
            0x49u,
            0x54u,
            0x53u,
            0x46u,
            0x03u,
            0x00u,
            0x00u,
            0x00u,
            0x60u,
            0x00u,
            0x00u,
            0x00u
        ).toByteArray(),
        "pdf" to ubyteArrayOf(0x25u, 0x50u, 0x44u, 0x46u, 0x2du).toByteArray(),
        "dex" to ubyteArrayOf(0x64u, 0x65u, 0x78u, 0x0Au, 0x30u, 0x33u, 0x35u, 0x00u).toByteArray(),
        "crx" to ubyteArrayOf(0x43u, 0x72u, 0x32u, 0x34u).toByteArray(),
        "dmg" to ubyteArrayOf(0x78u, 0x01u, 0x73u, 0x0Du, 0x62u, 0x62u, 0x60u).toByteArray(),
        "webm" to ubyteArrayOf(0x1Au, 0x45u, 0xDFu, 0xA3u).toByteArray(),
        "deb" to ubyteArrayOf(0x21u, 0x3Cu, 0x61u, 0x72u, 0x63u, 0x68u, 0x3Eu).toByteArray(),
        "muhadjeensecrets" to ubyteArrayOf(0x00u, 0x5Cu, 0x41u, 0xB1u, 0xFFu).toByteArray(),
        "ppt" to ubyteArrayOf(0x00u, 0x6Eu, 0x1Eu, 0xF0u).toByteArray(),
        "indd" to ubyteArrayOf(
            0x06u,
            0x06u,
            0xEDu,
            0xF5u,
            0xD8u,
            0x1Du,
            0x46u,
            0xE5u,
            0xBDu,
            0x31u,
            0xEFu,
            0xE7u,
            0xFEu,
            0x74u,
            0xB7u,
            0x1Du
        ).toByteArray(),
        "wallet" to ubyteArrayOf(
            0x0Au,
            0x16u,
            0x6Fu,
            0x72u,
            0x67u,
            0x2Eu,
            0x62u,
            0x69u,
            0x74u,
            0x63u,
            0x6Fu,
            0x69u,
            0x6Eu,
            0x2Eu,
            0x70u,
            0x72u
        ).toByteArray(),
        "mkv" to ubyteArrayOf(0x1Au, 0x45u, 0xDFu, 0xA3u).toByteArray(),
        "gz" to ubyteArrayOf(0x1Fu, 0x8Bu, 0x08u).toByteArray(),
        "eps" to ubyteArrayOf(
            0x25u,
            0x21u,
            0x50u,
            0x53u,
            0x2Du,
            0x41u,
            0x64u,
            0x6Fu,
            0x62u,
            0x65u,
            0x2Du,
            0x33u,
            0x2Eu,
            0x30u,
            0x20u,
            0x45u,
            0x50u,
            0x53u,
            0x46u,
            0x2Du,
            0x33u,
            0x20u,
            0x30u
        ).toByteArray(),
        "7z" to ubyteArrayOf(0x37u, 0x7Au, 0xBCu, 0xAFu, 0x27u, 0x1Cu).toByteArray(),
        "wsc" to ubyteArrayOf(0x3Cu, 0x3Fu).toByteArray(),
        "manifest" to ubyteArrayOf(
            0x3Cu,
            0x3Fu,
            0x78u,
            0x6Du,
            0x6Cu,
            0x20u,
            0x76u,
            0x65u,
            0x72u,
            0x73u,
            0x69u,
            0x6Fu,
            0x6Eu,
            0x3Du
        ).toByteArray(),
        "msc" to ubyteArrayOf(
            0x3Cu,
            0x3Fu,
            0x78u,
            0x6Du,
            0x6Cu,
            0x20u,
            0x76u,
            0x65u,
            0x72u,
            0x73u,
            0x69u,
            0x6Fu,
            0x6Eu,
            0x3Du,
            0x22u,
            0x31u,
            0x2Eu,
            0x30u,
            0x22u,
            0x3Fu,
            0x3Eu,
            0x0Du,
            0x0Au,
            0x3Cu,
            0x4Du,
            0x4Du,
            0x43u,
            0x5Fu,
            0x43u,
            0x6Fu,
            0x6Eu,
            0x73u,
            0x6Fu,
            0x6Cu,
            0x65u,
            0x46u,
            0x69u,
            0x6Cu,
            0x65u,
            0x20u,
            0x43u,
            0x6Fu,
            0x6Eu,
            0x73u,
            0x6Fu,
            0x6Cu,
            0x65u,
            0x56u,
            0x65u,
            0x72u,
            0x73u,
            0x69u,
            0x6Fu,
            0x6Eu,
            0x3Du,
            0x22u
        ).toByteArray(),
        "swf" to ubyteArrayOf(0x46u, 0x57u, 0x53u).toByteArray(),
        "mp3" to ubyteArrayOf(0x49u, 0x44u, 0x33u).toByteArray(),
        "torrent" to ubyteArrayOf(
            0x64u,
            0x38u,
            0x3Au,
            0x61u,
            0x6Eu,
            0x6Eu,
            0x6Fu,
            0x75u,
            0x6Eu,
            0x63u,
            0x65u
        ).toByteArray(),
    )
}