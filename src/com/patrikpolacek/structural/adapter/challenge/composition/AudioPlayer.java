package com.patrikpolacek.structural.adapter.challenge.composition;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3 " + filename);
        }
    }
}
