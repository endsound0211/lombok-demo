package com.endsound.lombok.Builder;

import lombok.var;
import org.junit.Test;

public class BuilderDemo {
    @Test
    public void demo() {
        var bean = new BuilderBean.BuilderBeanBuilder()
                .name("Andy")
                .age(11)
                .phone("123456")
                .build();
    }
}
