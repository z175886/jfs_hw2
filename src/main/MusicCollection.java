package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Chuyang Zhong
 * @version 1.0 5/5/2022
 */
public class MusicCollection {
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param album an album object that user selected
	 */
	public static void albumOptions(Album album) {
		int userChoice=1;
		System.out.println(album.toString());
		while(userChoice!=0) {//Prompt and then allow the user to pick from the following options: 1 for Get Favorite Track, 2 for Change genre
		System.out.println();
		System.out.println("Album options:");
		System.out.println("[1] Get Favorite Track");//
		System.out.println("[2] Change Genre");
		System.out.println("[0] Return to Main");
		System.out.print("Enter your selection: ");
		System.out.println();
		userChoice=sc.nextInt();
		if(userChoice==1) {//Get Favorite Track: prints out the song information (using the song's toString) of the favoriteTrack of the album, including the track number.
			System.out.println("Track No. "+album.getTrackNumber()+" "+album.getFavoriteTrack().toString());//Print out the Album information, using the Album's toString method. 
		}else if(userChoice==2) {//Allow the user to change the genre of the Album. This will update the genre of the associated song
			System.out.print("Enter new genre: ");
			sc.nextLine();//clear buffer
			album.setGenre(sc.nextLine());
		}else {// Allow the user to return to the main loop
			System.out.println();
		}
		}

	}
	public static void main(String args[]) {
		/*
		 * Create 3 music objects, using at least one of each version of the Song constructors.
		 * Create 3 albums object for each of the songs, using at least one of each of the Album constructors
		 * */
		Song song1 = new Song("I Got","Ice Cube","Rap");
		Song song2 = new Song("Hight right now","Lil Tyla","Rock");
		Song song3 = new Song("Can U Feel Your Face","BoyD","Classic");
		Album album1= new Album("Safe in the Steep Cliffs",song1);
		Album album2= new Album("How I Got over",song2,4);
		Album album3= new Album("Flux for Life",song3,8);
		//Create a list to store the albums and add each album to the list
		List<Album> albumList= new ArrayList<Album>();
		albumList.add(album1);
		albumList.add(album2);
		albumList.add(album3);
		//Main meun
		int userChoice=1;
		while(userChoice!=0){
		System.out.println("Music Collection: ");
		for(int i=0;i<Album.numAlbums;i++) {
			System.out.println("["+(i+1)+"]"+albumList.get(i).getTitle());	
		}
		System.out.print("Select an Album (0 to quit): ");
		userChoice=sc.nextInt();
		if (userChoice==0) {
			System.out.println("Program exited with code:0");//The loop should terminate if the user enters 0 for the album selection
			 System.exit(0);
		}else {
			albumOptions(albumList.get(userChoice-1));//Allows you to select which Album you would like to use, and then call the albumOptions method on that album.
		}
		
		}
		
		
	}

	
}
