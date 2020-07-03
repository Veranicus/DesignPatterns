package com.patrikpolacek.behavioral.command.example;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening up file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File in Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing File in WIndows OS");
    }
}
