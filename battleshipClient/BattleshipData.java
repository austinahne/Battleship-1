package battleshipClient;

public class BattleshipData {

	//send data to client sub system
	//clent send data to server
	
	//receive data from client sub system
	//
	
	private int boardIndex;
	private int boardDataValue;
	private String message;
	private boolean gameOver;
	
	
	private battleshipComm bsc;
	
	public void setboardIndex(int bi) {
		boardIndex = bi;
	}
	
	public void setboardDataValue(int bdv) {
		boardDataValue = bdv;
	}
	
	public void setgameOver(boolean go) {
		gameOver = go;
	}
	
	public void setMessage(String msgText) {
		message = msgText;
	}
	
	public void sendToServer() {
		System.out.println(message);
		System.out.println("Send To Server "+boardIndex+" "+boardDataValue);
		bsc = new battleshipComm(boardIndex);
		//client.sendToServer(bsc);
	}
	
}
