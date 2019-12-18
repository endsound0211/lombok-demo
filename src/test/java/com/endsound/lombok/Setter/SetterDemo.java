package com.endsound.lombok.Setter;

import lombok.var;
import org.junit.Test;

public class SetterDemo {
    @Test
    public void demo(){
        var bean = new SetterBean();
        bean.setName("test");
    }
}
