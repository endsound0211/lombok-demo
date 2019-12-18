package com.endsound.lombok.EqualsAndHashCode;

import lombok.var;
import org.junit.Test;

public class EqualsAndHashCodeDemo {
    @Test
    public void demo(){
        var bean = new EqualsAndHashCodeBean();
        bean.setName("Andy");
        bean.setAge(1);
    }
}
