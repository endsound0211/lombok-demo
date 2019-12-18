package com.endsound.lombok.Log;

import lombok.extern.java.Log;
import org.junit.Test;

@Log
public class LogDemo {
    @Test
    public void demo() {
        log.info("LogDemo");
    }
}
