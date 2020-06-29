package com.patrikpolacek.structural.adapter.challenge.composition;

public class VlcPlayer implements AdvancedMediaPlayer {
    String filename = "vlc";


    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void loadFilename(String fileName) {
        fileName = this.filename;
    }

    @Override
    public void listen() {
        if (filename.contains("vlc")) {
            System.out.println("Listening to " + filename);
        }
    }


}
