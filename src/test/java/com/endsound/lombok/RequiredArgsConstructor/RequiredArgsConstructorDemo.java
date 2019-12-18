package com.endsound.lombok.RequiredArgsConstructor;

import lombok.var;
import org.junit.Test;

public class RequiredArgsConstructorDemo {
    @Test
    public void demo() {
        var bean = new RequiredArgsConstructorBean("Andy");
    }
}
