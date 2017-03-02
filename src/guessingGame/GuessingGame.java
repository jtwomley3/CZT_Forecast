package guessingGame;

import java.util.ArrayList;

public class GuessingGame {
	
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	
	boolean p1Correct = false;
	boolean p2Correct = false;
	boolean p3Correct = false;
	ArrayList<Integer> winner = new ArrayList<Integer>();
	
	public int getWinnerCount(){
		return winner.size();
	}
	
	public void clearWinnerList(){
		winner.clear();
		p1Correct = false;
		p2Correct = false;
		p3Correct = false;
	}
	
	public void startGame(){
		System.out.println("Let the game begin!");
		
		int answer = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9.");
		
		while (true){	
			System.out.println("The number to guess is " + answer);
			p1.guess();
			p2.guess();
			p3.guess();
			
			int p1Guess = p1.getPlayerGuess();
			int p2Guess = p2.getPlayerGuess();
			int p3Guess = p3.getPlayerGuess();
			
//			System.out.println("Player 1 guessed " + p1Guess);
//			System.out.println("Player 2 guessed " + p2Guess);
//			System.out.println("Player 3 guessed " + p3Guess);
			
			if (p1Guess == answer){	
				p1Correct = true;
			}
			
			if (p2Guess == answer){
				p2Correct = true;
			}
			
			if (p3Guess == answer){
				p3Correct = true;
			}
			
			if (p3Correct == true || p2Correct == true || p1Correct == true){
				System.out.println("We have a winner!");
				
//				System.out.println("Player 1's guess was correct? - " + p1Correct);
//				System.out.println("Player 2's guess was correct? - " + p2Correct);
///				System.out.println("Player 3's guess was correct? - " + p3Correct);
				System.out.println("The game is Over.");
				break;
			}
			else {
				System.out.println("Players will have to try again.");
			}
		}
	}

	
	public void checkWinner(){
		
		
		if (p3Correct == true){
			winner.add(3);
		};
		if (p2Correct == true){
			winner.add(2);
		};
		if (p1Correct == true){
			winner.add(1);
		};
		
		if (winner.size() > 1){
			System.out.println("There were multiple winners...");
			System.out.print("They are players ");
			
			for  (int i=1; i <= winner.size(); i++){
				if (i == 1){
					System.out.print(winner.get(i));
				
				}
				else {
					System.out.print(", " + i);
				}
			}
			
			System.out.println(".");
			System.out.println("Congratulations!");
		}
		else {
			System.out.println("The winner was Player " + winner.get(0));
		}
	}
}
