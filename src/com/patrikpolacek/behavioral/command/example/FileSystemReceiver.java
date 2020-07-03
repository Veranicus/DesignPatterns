package com.patrikpolacek.behavioral.command.example;

public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}
