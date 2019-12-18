package com.endsound.lombok.NonNull;

import lombok.var;
import org.junit.Test;

public class NonNullDemo {
    @Test(expected = NullPointerException.class)
    public void demo(){
        var bean = new NonNullBean(null);
    }
}
