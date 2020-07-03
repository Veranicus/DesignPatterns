package com.patrikpolacek.behavioral.command.example;

public class Client {

    public static void main(String[] args) {
//        creating the receiver

        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

//        create the command with associating receiver

        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

//        creating invoker and associate it with the command

        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

//        perform ation on the invoker object

        fileInvoker.execute();


    }
}
