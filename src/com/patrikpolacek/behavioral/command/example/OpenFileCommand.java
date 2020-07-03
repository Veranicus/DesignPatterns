package com.patrikpolacek.behavioral.command.example;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    //        store previous state for undo


    public OpenFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
//        save previous state if we were to have undo
        fileSystem.openFile();
    }

    public void undo(){
//        restore previous state
//        myMemberVariable = previous state;
    }
}
