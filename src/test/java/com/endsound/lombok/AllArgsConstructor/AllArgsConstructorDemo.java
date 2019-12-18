package com.endsound.lombok.AllArgsConstructor;

import lombok.var;
import org.junit.Test;

public class AllArgsConstructorDemo {
    @Test
    public void demo() {
        var bean = new AllArgsConstructorBean("Andy", 1);
    }
}
