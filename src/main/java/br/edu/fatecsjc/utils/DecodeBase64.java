package br.edu.fatecsjc.utils;

import br.edu.fatecsjc.models.Problema;

import java.util.Arrays;
import java.util.Base64;

public class DecodeBase64 {

    private String string;

    private byte[] byteArray;

    public DecodeBase64() {
    }

    public DecodeBase64(Problema problema, byte[] byteArray) {
        this.string = Arrays.toString(problema.getSourcecode());
        this.byteArray = byteArray;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public byte[] getByteArray() {
        return byteArray;
    }

    public void setByteArray(byte[] byteArray) {
        this.byteArray = Base64.getDecoder().decode(byteArray);
    }

    @Override
    public String toString() {
        return Arrays.toString(byteArray);
    }
}
