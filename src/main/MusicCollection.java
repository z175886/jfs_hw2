package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicCollection {
	static Scanner sc = new Scanner(System.in);
	public static void albumOptions(Album album) {
		int userChoice=1;
		System.out.println(album.toString());
		while(userChoice!=0) {
		System.out.println();
		System.out.println("Album options:");
		System.out.println("[1] Get Favorite Track");
		System.out.println("[2] Change Genre");
		System.out.println("[0] Return to Main");
		System.out.print("Enter your selection: ");
		System.out.println();
		userChoice=sc.nextInt();
		if(userChoice==1) {
			System.out.println("Track No. "+album.getTrackNumber()+" "+album.getFavoriteTrack().toString());
		}else if(userChoice==2) {
			System.out.print("Enter new genre: ");
			sc.nextLine();//clear buffer
			album.setGenre(sc.nextLine());
		}else {//back to main menu
			System.out.println();
		}
		}
		
		
	}
	public static void main(String args[]) {
		Song song1 = new Song("I Got","Ice Cube","Rap");
		Song song2 = new Song("Hight right now","Lil Tyla","Rock");
		Song song3 = new Song("Can U Feel Your Face","BoyD","Classic");

		
		Album album1= new Album("Safe in the Steep Cliffs",song1);
		Album album2= new Album("How I Got over",song2,4);
		Album album3= new Album("Flux for Life",song3,8);

		
		
		List<Album> albumList= new ArrayList<Album>();
		albumList.add(album1);
		albumList.add(album2);
		albumList.add(album3);
		int userChoice=1;
	
		while(userChoice!=0){
			
		System.out.println("Music Collection: ");
		for(int i=0;i<Album.numAlbums;i++) {
			System.out.println("["+(i+1)+"]"+albumList.get(i).getTitle());	
		}
		System.out.print("Select an Album (0 to quit): ");
		userChoice=sc.nextInt();
		if (userChoice==0) {
			System.out.println("Program exited with code:0");
			 System.exit(0);
		}else {
			albumOptions(albumList.get(userChoice-1));
		}
		
		
		}
		
		
		
		
	}

	
}
