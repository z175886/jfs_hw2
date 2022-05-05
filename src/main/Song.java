package main;

public class Song {
	private String title;
	private String artist;
	private String genre;
	public Song(String title,String artist,String genre) {
		this.title=title;
		this.artist=artist;
		this.genre=genre;
	}
	public Song(String title, String artist) {
		this.title=title;
		this.artist=artist;	
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre=genre;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return artist+" - "+title+", "+"Genre: "+genre;
	}
	
}
