package model;

public class LoginLogic {

	public boolean execute(TUser user) {
		if (user.getPass().equals("1234")) {
			return true;
		}
		return false;
	}
}
