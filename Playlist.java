package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    private String playlistName;
    private LinkedList<Song> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlist = new LinkedList<Song>();

    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void addSongToPlaylist (Song song){

        playlist.add(song);



    }


    public static void printPlaylist(LinkedList<Song> linkedList) {
        Iterator<Song> i= linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Song title: "  + i.next().getTitle() );
        }
        System.out.println("=========================");
    }


}
