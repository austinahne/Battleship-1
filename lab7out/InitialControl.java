package lab7out;

import java.awt.Color;

import javax.swing.*;

public class InitialControl {

	//private JButton login;
	//private JButton create;
	private InitialPanel ip;
	private ChatClient client;
	
	public InitialControl() {}
	
	public void accountLogin() {
		new LoginPanel("Cat Client",client);
	}
	
	public void accountCreate() {
		new CreateAccountPanel("Cat Client",client);
	}
	public void setInitialPanel(InitialPanel ip) {
		this.ip = ip;
	}
	public void setClient(ChatClient client) {
		this.client=client;
	}
	
	
}
