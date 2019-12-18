package com.endsound.lombok.NoArgsConstructor;

import lombok.var;
import org.junit.Test;

public class NoArgsConstructorDemo {
    @Test
    public void demo(){
        var bean = new NoArgsConstructorBean();
    }
}
