package com.patrikpolacek.behavioral.command.example;

public class WriteFileCommand implements Command {

    FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        fileSystem.writeFile();
    }
}
