package JVM_Architecture;

import java.io.*;

public class CustomClassLoader extends ClassLoader {

    public Class<?> loadMyClass(String name) throws Exception {

        FileInputStream fis = new FileInputStream(name + ".class");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int data;
        while ((data = fis.read()) != -1) {
            baos.write(data);
        }

        byte[] bytes = baos.toByteArray();

        return super.defineClass(name, bytes, 0, bytes.length);
    }
}