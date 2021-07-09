public class GameOperations {
	public double startPosition;

	public GameOperations(double startPosition) {
		super();
		this.startPosition = startPosition;
		System.out.println("Player Start position - "+startPosition);
	}
	
	public void rollDie() {
		System.out.println(Math.floor((Math.random()*6)+1)); //roll dice function
		}
	
	
	
}
