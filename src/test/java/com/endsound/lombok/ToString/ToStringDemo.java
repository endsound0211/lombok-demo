package com.endsound.lombok.ToString;

import lombok.var;
import org.junit.Test;

public class ToStringDemo {
    @Test
    public void demo(){
        var bean = new ToStringBean();
        bean.setName("Andy");
        bean.setAge(1);
        System.out.println(bean);
    }
}
