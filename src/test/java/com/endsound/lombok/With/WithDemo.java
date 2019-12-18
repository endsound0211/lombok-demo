package com.endsound.lombok.With;

import lombok.var;
import org.junit.Test;

public class WithDemo {
    @Test
    public void demo() {
        var bean = new WithBean("Andy", 1);
        bean.withName("Ken");
    }
}
