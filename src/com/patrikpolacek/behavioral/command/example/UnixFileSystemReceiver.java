package com.patrikpolacek.behavioral.command.example;

public class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening up file in unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File in unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File in Unix OS");
    }
}
