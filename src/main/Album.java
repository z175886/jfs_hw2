package main;

/**
 * @author Chuyang Zhong
 * @version 1.0 5/5/2022
 */
public class Album {
	private String title;
	private String artist;
	private String genre;
	private Song favoriteTrack;
	private int trackNumber;
	public static int numAlbums;
	/**
	 * Album Constrctor,Assigns the instance variables:title,favoriteTrack,trackNumber
	 * @param title title of the album
	 * @param favoriteTrack the favorite track in the album
	 * @param trackNumber the track number of the favorite track.
	 */
	public Album(String title,Song favoriteTrack,int trackNumber) {
		this.title=title;
		this.favoriteTrack=favoriteTrack;
		this.artist=favoriteTrack.getArtist();
		this.genre=favoriteTrack.getGenre();
		this.trackNumber=trackNumber;
		this.numAlbums+=1;
	}
	/**
	 * Album Constrctor,Assigns the instance variables:title,favoriteTrack with default trackNumber=1
	 * @param title title of the album
	 * @param favoriteTrack the favorite track in the album
	 */
	public Album(String title,Song favoriteTrack) {
		this.title=title;
		this.favoriteTrack=favoriteTrack;
		this.artist=favoriteTrack.getArtist();
		this.genre=favoriteTrack.getGenre();
		this.numAlbums+=1;
		this.trackNumber=1;	
	}
	/**
	 * @return title of the album
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return a Song object that represent the favorite Track of the album
	 */
	public Song getFavoriteTrack() {
		return favoriteTrack;
	}

	/**
	 * @return the trackNumber of the favorite Track
	 */
	public int getTrackNumber() {
		return trackNumber;
	}
	/**
	 * @param genre set the genre of the album
	 */
	public void setGenre(String genre) {
		this.genre=genre;
	}
	/**
	 *A toString method that returns a String comprised of the artist,title, and genre of the album
	 */
	public String toString() {
		return "\" "+ title +" \""+ "by "+artist+" : "+genre;
	}
	

	
}
