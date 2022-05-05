package main;

public class Album {
	private String title;
	private String artist;
	private String genre;
	private Song favoriteTrack;
	private int trackNumber;
	public static int numAlbums;
	public Album(String title,Song favoriteTrack,int trackNumber) {
		this.title=title;
		this.favoriteTrack=favoriteTrack;
		this.artist=favoriteTrack.getArtist();
		this.genre=favoriteTrack.getGenre();
		this.trackNumber=trackNumber;
		this.numAlbums+=1;
	}
	public Album(String title,Song favoriteTrack) {
		this.title=title;
		this.favoriteTrack=favoriteTrack;
		this.artist=favoriteTrack.getArtist();
		this.genre=favoriteTrack.getGenre();
		this.numAlbums+=1;
		this.trackNumber=1;	
	}
	public String getTitle() {
		return title;
	}

	public Song getFavoriteTrack() {
		return favoriteTrack;
	}

	public int getTrackNumber() {
		return trackNumber;
	}
	public void setGenre(String genre) {
		this.genre=genre;
	}
	public String toString() {
		return "\" "+ title +" \""+ "by "+artist+" : "+genre;
	}
	

	
}
