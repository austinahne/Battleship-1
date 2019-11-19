package lab7out;

import java.io.Serializable;

public class CreateAccountData implements Serializable {
	private String username;
	private String password;
	private String passwordconf;
	
	public CreateAccountData(String username, String password, String passwordconf) {
		this.username = username;
		this.password = password;
		this.passwordconf = passwordconf;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getPasswordConf() {
		return passwordconf;
	}
}
