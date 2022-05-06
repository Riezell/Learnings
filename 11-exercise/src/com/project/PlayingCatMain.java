package com.project;

public class PlayingCatMain {

	public static void main(String[] args) {
		
		PlayingcCat play = new PlayingcCat();
		
		play.isCatPlaying(true, 10);
		play.isCatPlaying(false, 36);
		play.isCatPlaying(false, 35);
	}

}
