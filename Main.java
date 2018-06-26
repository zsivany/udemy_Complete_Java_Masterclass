package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Song song2 = new Song("Valami", 150);
        Song song3 = new Song("Nyet", 190);
        Song song4 = new Song("Rump", 220);
        Song song5 = new Song("Prukk", 430);
        Song song6 = new Song("Brank", 555);


        Album album1 = new Album("Darabok");

        album1.addSongToAlbum(album1.createSong("Szembenanappal", 180));
        album1.addSongToAlbum(album1.createSong("Valami", 120));
        album1.addSongToAlbum(album1.createSong("trutty", 140));
        album1.addSongToAlbum(album1.createSong("Kalap", 130));
        album1.addSongToAlbum(album1.createSong("Kabat", 220));
        album1.addSongToAlbum(album1.createSong("Taska", 400));


        Playlist playlist = new Playlist("Retro");

        playlist.addSongToPlaylist(song3);
        playlist.addSongToPlaylist(song4);
        playlist.addSongToPlaylist(album1.getSongs().get(0));
        playlist.addSongToPlaylist(album1.getSongs().get(1));
        playlist.addSongToPlaylist(album1.getSongs().get(2));
        playlist.addSongToPlaylist(album1.getSongs().get(3));


        playlist.printPlaylist(playlist.getPlaylist());

        System.out.println(playlist.getPlaylist().get(0).getTitle());
        System.out.println(playlist.getPlaylist().get(1).getTitle());
        System.out.println(playlist.getPlaylist().get(2).getTitle());
        System.out.println(playlist.getPlaylist().get(3).getTitle());
        System.out.println(playlist.getPlaylist().get(4).getTitle());
        System.out.println(playlist.getPlaylist().get(5).getTitle());

        //System.out.println("Album: " + album1.getAlbumTitle() + " Song: " + album1.getSongs().get(0).getTitle());



    }
}
