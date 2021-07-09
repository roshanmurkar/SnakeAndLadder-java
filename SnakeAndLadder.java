//import java.util.*;
public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double startPosition=0;
		double endPosition=100;
		GameOperations startGame = new GameOperations(startPosition);
		
		startGame.rollDie(); //go to roll dice fun
		
		startGame.nextMove(); //go to move fun
	
	}
	

}
