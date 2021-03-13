package model;

import java.io.Serializable;

public class TUser implements Serializable{

	// ユーザー名
	private String name;
	// パスワード
	private String pass;

	public TUser() {

	}

	public TUser(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

}
