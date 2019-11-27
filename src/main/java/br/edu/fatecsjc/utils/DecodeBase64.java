package br.edu.fatecsjc.utils;

import org.apache.commons.codec.binary.Base64;

public class DecodeBase64 {

    public String decode(String source) {

        byte[] sourceDecoded = Base64.decodeBase64(source);

        return new String(sourceDecoded);
    }
}
