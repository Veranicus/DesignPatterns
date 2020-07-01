package com.patrikpolacek.structural.decorator.decorator_file_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {

    public static void main(String[] args) throws IOException {
        int c;

        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/com/patrikpolacek/structural/decorator/decorator_file_io/test.txt")));
        while ((c = in.read()) >= 0) {
            System.out.println((char) c);
        }
        in.close();
    }
}
