package br.edu.fatecsjc.utils;

import org.apache.commons.codec.binary.Base64;

public class DecodeBase64 {


    public static String decode(String source) {

        byte[] sourceDecoded = Base64.decodeBase64(source);

        return new String(sourceDecoded);
        // ou return Arrays.toString(sourceDecoded);
    }
}
