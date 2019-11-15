package battleshipClient;

import java.io.Serializable;

public class battleshipComm  implements Serializable {

	private int boardIndex;
	private int boardDataValue;
	private String message;
	private boolean gameOver;
	
	
	//This constructor assigns the index of the button the player clicked
	
	
	public battleshipComm(int boardIndex) {
		this.boardIndex = boardIndex;
	}
	
	//setters
	//The server must assign the datavalue, message, and gameover vars
	public void setBoarIndex(int indexValue) {
		boardIndex = indexValue;
	}
	public void setDataValue(int dataValue) {
		boardDataValue = dataValue;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
	
	// Getters
	public int getboardIndex() {
		return boardIndex;
	}
	
	public int getDataValue() {
		return boardDataValue;
	}
	
	public String getMessage() {
		return message;
	}
	
	public boolean getGameOver() {
		return gameOver;
	}
}
	

	
