package guessingGame;

public class GuessingGameLauncher {

	
	public static void main (String[] args){
	
	GuessingGame newgame = new GuessingGame();
	
	while (true){
	newgame.startGame();
	newgame.checkWinner();
	
		if (newgame.getWinnerCount() > 1){
			break;
		}
		
	newgame.clearWinnerList();
	}
	

	// This line does nothing...literally	
	
	//This is a different comment
	
	}
}
