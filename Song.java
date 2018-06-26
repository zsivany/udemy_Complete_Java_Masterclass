package com.company;

public class Song {

    private String title;
    private int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }


    private void setDuration(int duration) {
        this.duration = duration;
    }
}
