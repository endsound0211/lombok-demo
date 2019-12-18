package com.endsound.lombok.Data;

import lombok.var;
import org.junit.Test;

public class DataDemo {
    @Test
    public void demo() {
        var bean = new DataBean();
        bean.setName("Andy");
        bean.setAge(1);
    }
}
