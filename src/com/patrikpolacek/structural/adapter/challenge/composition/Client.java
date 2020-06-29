package com.patrikpolacek.structural.adapter.challenge.composition;

public class Client {

    public static void main(String[] args) {
        MP4Player MP4Player = new MP4Player();
        MP4Player.setFileName("mp4");
        MP4Player.listen();

        VlcPlayer vlcPlayer = new VlcPlayer();
        vlcPlayer.setFilename("vlc");
        vlcPlayer.setFilename("vlc");
        vlcPlayer.listen();


        MediaPlayer advancedMediaPlayerAdapter = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter.play("vlc", "testFile.vlc");


    }


}
