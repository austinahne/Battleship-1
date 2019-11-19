package lab7out;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CreateAccountControl {
	private CreateAccountPanel cap;
	private JTextField usern;
	private JTextField passw;
	private JTextField passwconf;
	private CreateAccountData capData;
	
	public CreateAccountControl() {}
	
	public void loginSubmit() {
		capData = new CreateAccountData(usern.getText(),passw.getText(),passwconf.getText());
		
		
	}
	
	public void loginCancel() {
		cap.dispose();
	}
	
	public void setCAP(CreateAccountPanel cap) {
		this.cap = cap;
	}
	public void setUN(JTextField usern2) {
		this.usern = usern2;
	}

	public void setPW(JTextField passw2) {
		this.passw = passw2;
		
	}
	public void setPWC(JTextField passwconf) {
		this.passwconf = passwconf;
		
	}
}
