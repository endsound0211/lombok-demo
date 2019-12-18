package com.endsound.lombok.SneakyThrows;

import lombok.SneakyThrows;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class SneakyThrowsDemo {
    @Test
    public void demo() {
        String string = "Test";
        System.out.println(utf8ToString(string.getBytes()));
    }

    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }
}
