package com.adeytech;

import org.apache.commons.codec.binary.Base64;

import java.io.*;

/**
 * Created by Zelalem on 6/29/2017.
 */
public class ENcoder {
    public String encodeFileToBase64Binary(String fileName)
            throws IOException {

        File file = new File(fileName);
        byte[] bytes = loadFile(file);
        byte[] encoded = Base64.encodeBase64(bytes);
        String encodedString = new String(encoded);

        return encodedString;
    }


    public void decodeToXLS() throws IOException {
        byte [] decoded = Base64.decodeBase64(
    "0M8R4KGxGuEAAAAAAAAAAAAAAAAAAAAAOwADAP7/CQAGAAAAAAAAAAAAAAABAAAAAAAA\n" +
                "AAAAAAAAEAAAAgAAAAEAAAD+////AAAAAAEAAAD/////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "//9SAG8AbwB0ACAARQBuAHQAcgB5AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAFgAFAf//////////AQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAAMAAACABwAAAAAAAFcAbwByAGsAYgBvAG8AawAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASAAIB////////\n" +
                "////////AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAFAHAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "AAAAAP7////9/////v///wQAAAAFAAAABgAAAP7/////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////AQAAAAIAAAADAAAABAAAAAUAAAAGAAAABwAAAAgAAAAJAAAACgAAAAsAAAAM\n" +
                "AAAADQAAAA4AAAAPAAAAEAAAABEAAAASAAAAEwAAABQAAAAVAAAAFgAAABcAAAAYAAAA\n" +
                "GQAAABoAAAAbAAAAHAAAAB0AAAD+////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "////////////////////////////////////////////////////////////////////\n" +
                "//////////8JCBAAAAYFANMQzAdBAAAABgAAAOEAAgCwBMEAAgAAAOIAAABcAHAABwAA\n" +
                "WmVsYWxlbSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" +
                "ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAg\n" +
                "ICAgICAgIEIAAgCwBGEBAgAAAD0BAgAAAJwAAgAOABkAAgAAABIAAgAAABMAAgAAAK8B\n" +
                "AgAAALwBAgAAAD0AEgBoAQ4BXDq+IzgAAAAAAAEAWAJAAAIAAACNAAIAAAAiAAIAAAAO\n" +
                "AAIAAQC3AQIAAADaAAIAAAAxABUAyAAAAP9/kAEAAAAAAAAFAEFyaWFsMQAVAMgAAAD/\n" +
                "f5ABAAAAAAAABQBBcmlhbDEAFQDIAAAA/3+QAQAAAAAAAAUAQXJpYWwxABUAyAAAAP9/\n" +
                "kAEAAAAAAAAFAEFyaWFsHgQaAAUAFQAAIiQiIywjIzBfKTsoIiQiIywjIzApHgQfAAYA\n" +
                "GgAAIiQiIywjIzBfKTtbUmVkXSgiJCIjLCMjMCkeBCAABwAbAAAiJCIjLCMjMC4wMF8p\n" +
                "OygiJCIjLCMjMC4wMCkeBCUACAAgAAAiJCIjLCMjMC4wMF8pO1tSZWRdKCIkIiMsIyMw\n" +
                "LjAwKR4ELAAqACcAAF8oKiAjLCMjMF8pO18oKiAoIywjIzApO18oKiAiLSJfKTtfKEBf\n" +
                "KR4ENQApADAAAF8oIiQiKiAjLCMjMF8pO18oIiQiKiAoIywjIzApO18oIiQiKiAiLSJf\n" +
                "KTtfKEBfKR4EPQAsADgAAF8oIiQiKiAjLCMjMC4wMF8pO18oIiQiKiAoIywjIzAuMDAp\n" +
                "O18oIiQiKiAiLSI/P18pO18oQF8pHgQ0ACsALwAAXygqICMsIyMwLjAwXyk7XygqICgj\n" +
                "LCMjMC4wMCk7XygqICItIj8/Xyk7XyhAXyngABQAAAAAAPX/IAAAAAAAAAAAAAAAwCDg\n" +
                "ABQAAQAAAPX/IAAA9AAAAAAAAAAAwCDgABQAAQAAAPX/IAAA9AAAAAAAAAAAwCDgABQA\n" +
                "AgAAAPX/IAAA9AAAAAAAAAAAwCDgABQAAgAAAPX/IAAA9AAAAAAAAAAAwCDgABQAAAAA\n" +
                "APX/IAAA9AAAAAAAAAAAwCDgABQAAAAAAPX/IAAA9AAAAAAAAAAAwCDgABQAAAAAAPX/\n" +
                "IAAA9AAAAAAAAAAAwCDgABQAAAAAAPX/IAAA9AAAAAAAAAAAwCDgABQAAAAAAPX/IAAA\n" +
                "9AAAAAAAAAAAwCDgABQAAAAAAPX/IAAA9AAAAAAAAAAAwCDgABQAAAAAAPX/IAAA9AAA\n" +
                "AAAAAAAAwCDgABQAAAAAAPX/IAAA9AAAAAAAAAAAwCDgABQAAAAAAPX/IAAA9AAAAAAA\n" +
                "AAAAwCDgABQAAAAAAPX/IAAA9AAAAAAAAAAAwCDgABQAAAAAAAEAIAAAAAAAAAAAAAAA\n" +
                "wCDgABQAAQArAPX/IAAA+AAAAAAAAAAAwCDgABQAAQApAPX/IAAA+AAAAAAAAAAAwCDg\n" +
                "ABQAAQAsAPX/IAAA+AAAAAAAAAAAwCDgABQAAQAqAPX/IAAA+AAAAAAAAAAAwCDgABQA\n" +
                "AQAJAPX/IAAA+AAAAAAAAAAAwCCTAgQAEIAD/5MCBAARgAb/kwIEABKABP+TAgQAE4AH\n" +
                "/5MCBAAAgAD/kwIEABSABf9gAQIAAACFABIAqwUAAAAACgBGaXJzdFNoZWV0jAAEAAEA\n" +
                "AQCuAQQAAQABBBcACAABAAAAAAAAAPwAWQAIAAAACAAAAAMAAE5vLgQAAE5hbWUHAABB\n" +
                "ZGRyZXNzBQAARW1haWwBAAAxBwAATXkgTmFtZQ8AAE15IEhvbWUgQWRkcmVzcw8AAE15\n" +
                "IGdtYWlsIGVtYWlsLv8ACgAIAEgFAAAMAAAACgAAAAkIEAAABhAAuw3MB8EAAAAGAAAA\n" +
                "CwIUAAAAAAAAAAAAAgAAAAAAAAAXBwAADQACAAEADAACAGQADwACAAEAEQACAAAAEAAI\n" +
                "APyp8dJNYlA/XwACAAEAKgACAAAAKwACAAAAggACAAEAgAAIAAAAAAAAAAAAJQIEAAAA\n" +
                "/wCBAAIAwQQUAAAAFQAAAIMAAgAAAIQAAgAAAKEAIgABAGQAAQABAAEAAgAsASwBAAAA\n" +
                "AAAA4D8AAAAAAADgPwEAVQACAAgAAAIOAAAAAAACAAAAAAAEAAAACAIQAAAAAAAEAP8A\n" +
                "AAAAAAABDwAIAhAAAQAAAAQA/wAAAAAAAAEPAP0ACgAAAAAADwAAAAAA/QAKAAAAAQAP\n" +
                "AAEAAAD9AAoAAAACAA8AAgAAAP0ACgAAAAMADwADAAAA/QAKAAEAAAAPAAQAAAD9AAoA\n" +
                "AQABAA8ABQAAAP0ACgABAAIADwAGAAAA/QAKAAEAAwAPAAcAAADXAAgAmAAAABQAOAA+\n" +
                "AhIAtgYAAAAAQAAAAAAAAAAAAAAAHQAPAAMAAAAAAAABAAAAAAAAAAoAAAD/////////\n" +
                "//////////////////////////////////////////////////////8AAAAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                "AAAAAAAAAAAAAAAAAAAAAA==");

        File file = new File("E:/output.xls");
        FileOutputStream fileOutputStream  = new FileOutputStream(file);
        fileOutputStream.write(decoded);
    }

    private static byte[] loadFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);

        long length = file.length();
        if (length > Integer.MAX_VALUE) {
            // File is too large
        }
        byte[] bytes = new byte[(int)length];

        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length
                && (numRead= is.read(bytes, offset, bytes.length-offset)) >= 0) {
            offset += numRead;
        }

        if (offset < bytes.length) {
            throw new IOException("Could not completely read file "+file.getName());
        }

        is.close();
        return bytes;
    }

}
