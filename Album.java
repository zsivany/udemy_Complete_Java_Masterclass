package com.company;

import java.util.ArrayList;


public class Album {

    private String albumTitle;
    private ArrayList<Song> albumsongs;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.albumsongs = new ArrayList<Song>();


    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getSongs() {
        return albumsongs;
    }

    public void addSongToAlbum (Song song){

        if (returnSongBoolean(song)){
            System.out.println("Song already exist!");
            return;
        }
        albumsongs.add(song);

    }

    //return index for song title
    public int returnSongInt(String songTitle){


        for (int i = 0; i < albumsongs.size(); i++) {
            if (albumsongs.get(i).getTitle().equals(songTitle)){
                return i;
            }
            }


        return -1;
    }


    //exist a song on given album
    public boolean returnSongBoolean(Song song){

        return albumsongs.contains(song);

        }


    public Song createSong(String songTitle, int songDuration){

            Song song = new Song(songTitle, songDuration);
            return song;

    }

}
