package main;

/**
 * @author Chuyang Zhong
 * @version 1.0 5/5/2022
 */
public class Song {
	/**
	 * Representing the title of the song
	 */
	private String title;
	/**
	 * Representing the artist of the song
	 */
	private String artist;
	/**
	 * Representing the genre of the song
	 */
	private String genre;
	/**
	 * Song Constructor. Assigns the instance variables:title,artist,genre
	 * @param title title of the song
	 * @param artist artist of the song
	 * @param genre genre of the song
	 */
	public Song(String title,String artist,String genre) {
		this.title=title;
		this.artist=artist;
		this.genre=genre;
	}
	/**
	 * Song Constructor. Assigns the instance variables:title,artist.
	 * @param title title of the song
	 * @param artist artist of the song
	 */
	public Song(String title, String artist) {
		this.title=title;
		this.artist=artist;	
	}
	/**
	 * @return The title of the song
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return The artist of the song
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @return The genre of the song
	 */ 
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre set genre for the song genre
	 */
	public void setGenre(String genre) {
		this.genre=genre;
	}
	/**
	 * @param artist set artist for the song artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @param title set title for the song
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 *A toString method that returns a String comprised of the artist,title, and genre of the song
	 */
	public String toString() {
		return artist+" - "+title+", "+"Genre: "+genre;
	}
	
}
