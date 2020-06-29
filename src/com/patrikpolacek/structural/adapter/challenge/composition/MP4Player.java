package com.patrikpolacek.structural.adapter.challenge.composition;

public class MP4Player implements AdvancedMediaPlayer {

  private String fileName = "mp4";

    @Override
    public void loadFilename(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        if (fileName.contains("mp4")){
            System.out.println("Listening to " + fileName);
        }
    }
}
