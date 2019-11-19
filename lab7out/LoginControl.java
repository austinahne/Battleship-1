package lab7out;

import java.io.IOException;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginControl {
	
	private LoginPanel lp;
	private JTextField usern;
	private JTextField passw;
	private LoginData larrydavid;
	private ChatClient client;
	
	public LoginControl() {}
	
	public void loginSubmit() {
		larrydavid = new LoginData(usern.getText(),passw.getText());
		try {
			client.sendToServer(larrydavid);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void loginCancel() {
		lp.dispose();
	}
	
	public void setLP(LoginPanel lp) {
		this.lp = lp;
	}
	public void setUN(JTextField usern2) {
		this.usern = usern2;
	}

	public void setPW(JTextField passw2) {
		this.passw = passw2;
	}
	public void setClient(ChatClient client) {
		this.client = client;
	}
}
