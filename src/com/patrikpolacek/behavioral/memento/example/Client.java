package com.patrikpolacek.behavioral.memento.example;

public class Client {

    public static void main(String[] args) {
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("testFile.txt");

        fileWriterUtil.write("First Set of Data: \nMyra \nLucy\n");
        System.out.println(fileWriterUtil + "\n \n");

        fileWriterCaretaker.save(fileWriterUtil);

        fileWriterUtil.write("Second Set of Data: \nJohn \nCiri\n");

        System.out.println(fileWriterUtil + "\n\n");

        fileWriterCaretaker.undo(fileWriterUtil);

        System.out.println(fileWriterUtil);
    }
}
