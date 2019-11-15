package battleshipServer;

public class playGame {

	
	/* Board Data is used to store the contents of each player's 
			board. Each number element of the array corresponds to the
			tile on the board. 
			
	// 0 - ship length 2
	// 1 - ship length 3
	// 2 - ship length 3
	// 3 - ship length 4
	// 4 - ship length 5
	// 5 - ship hit
	// 6 - water
	// 7 - water miss
	 
	*/
	private int[] p1boardData = new int [100];
	private int[] p2boardData = new int [100];
	
	/* Ship Data is used to store the player's ships.
	 * Each INDEX of the shipData array corresponds to 
	 * a player's ship. The data in the INDEX element is an int
	 * that stores how many hits remain until the ship is sunk.
	 * ie. (the lenght of the ship)
	 * 
	 * Each time a ship is hit, it's data is decremented.
	 * When a ships data = 0, the ship is sunk
	 * When all the ships are sunk, the game is over.
	 * 
	 * ShipCount stores the number of ships
	
	
	
	*/
	private int[] p1shipData = new int[5];
	private int[] p2shipData = new int[5];
	private int p1shipCount;
	private int p2shipCount;
	
	//Turn
	// used to determine whose turn it is
	// used to determine which board to check and edit.
	// true - player1
	// false - player 2
	private boolean p1Turn;
	
	//Message to Client
	// Used to display the result of the turn to the player
	private String messageToPlayer;
	
	
	public playGame() {
		//Set p1 and p2 Boards to All Water
		for(int index = 0; index < p1boardData.length; index++) {
			p1boardData[index]=6;
			p2boardData[index]=6;
		}
		//Set p1 and p2 Ships to 0
		for(int index = 0; index < p1shipData.length; index++) {
			p1shipData[index]=0;
			p2shipData[index]=0;
		}
		//Players will place ships
		
		//Players will guess where their opponents ships are
		//Set player1 turn to true;
		p1Turn = true;

		
		
	}
	
	
	public void placeShips(boolean player1, int boardIndex) {
		//assign ship to boarddata
		//initialize shipdata to length
	}
	
	public void checkShips(boolean player1){
		if (player1) {
			//check player 2 ships
			
		}
		else {
			//check player 1 ships
			
		}
	}
	
	public void turn(boolean player1, int boardIndex) {
		
		if (player1 != p1Turn) {
			// its not your turn!!
			// send back to client
			messageToPlayer = new String("It's Not Your Turn!!!");
		}
		//player2s turn
		//player 2 is attacking player 1s board
		else if(!player1) {
			switch(p1boardData[boardIndex]) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				//ship
				//change to shiphit
				//decrement ship no
				messageToPlayer = new String("HIT!!!");
				p1shipData[p1boardData[boardIndex]]--;
				p1boardData[boardIndex]=5;
				p1Turn = false;
				break;
			case 5:
				//already hit here
				//does not change turn
				messageToPlayer = new String("You've Already Shot Here");
				break;
			case 6:
				//water
				//change to miss
				messageToPlayer = new String("MISS!!!");
				p1boardData[boardIndex]=7;
				p1Turn = false;
				break;
			case 7:
				//watermiss
				//already missed here
				//does not change turn
				messageToPlayer = new String("You've Already Missed Here");
				break;
			default:
				//data error
				messageToPlayer = new String("Board Data Error, something went wrong");
				break;
			}
		}
		//player1s turn
		//player 1 is attacking player2s board
		else{
			switch(p2boardData[boardIndex]) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				//ship
				//change to shiphit
				//decrement ship no
				messageToPlayer = new String("HIT!!!");
				p2shipData[p2boardData[boardIndex]]--;
				p2boardData[boardIndex]=5;
				checkShips(p1Turn);
				p1Turn=true;
				break;
			case 5:
				//already hit here
				//does not change turn
				messageToPlayer = new String("You've Already Shot Here");
				break;
			case 6:
				//water
				//change to miss
				messageToPlayer = new String("MISS!!!");
				p2boardData[boardIndex]=7;
				p1Turn=true;
				break;
			case 7:
				//watermiss
				//already missed here
				//does not change turn
				messageToPlayer = new String("You've Already Missed Here");
				break;
			default:
				//data error
				messageToPlayer = new String("Board Data Error, something went wrong");
				break;
			}
		}
	}
	
	public void endGame() {
	
	}
	
}
