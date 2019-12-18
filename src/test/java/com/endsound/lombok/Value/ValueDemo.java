package com.endsound.lombok.Value;


import lombok.var;
import org.junit.Test;

public class ValueDemo {
    @Test
    public void demo() {
        var bean = new ValueBean("Andy", 1);
    }
}
