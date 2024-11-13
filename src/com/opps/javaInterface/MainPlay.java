package com.opps.javaInterface;

public class MainPlay {
	public static void main(String[] args) {
//		Playable[] playables= {new Basketball(),new Football(),new Volleyball()};
//		for(Playable play: playables) {
//			play.play();
//		}
		
		Basketball basketball=new Basketball();
		Football football=new Football();
		Volleyball volleyball=new Volleyball();
		basketball.play();
		football.play();
		volleyball.play();
	}
}
