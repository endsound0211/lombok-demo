package com.endsound.lombok.Cleanup;

import lombok.Cleanup;
import lombok.var;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CleanupDemo {
    @Test
    public void demo() throws IOException {
        var classLoader = getClass().getClassLoader();
        var url = classLoader.getResource("cleanup-file");
        @Cleanup var is = new FileInputStream(url.getFile());
        @Cleanup var os = new FileOutputStream("./clean-file-out");
        var buffer = new byte[10000];
        while (true){
            var r = is.read(buffer);
            if(r == -1) break;
            os.write(buffer, 0, r);
        }
    }
}
