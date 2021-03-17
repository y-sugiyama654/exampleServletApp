package test;

import model.Account;
import model.AccountDAO;
import model.Login;

public class AccountDAOTest {

	public static void main(String[] args) {
		testFindByLogin1(); // ユーザーが見つかる場合のテスト
		testFindByLogin2(); // ユーザーが見つからない場合のテスト
	}

    public static void testFindByLogin1() {
    	Login login = new Login("minato", "1234");
    	AccountDAO dao = new AccountDAO();
    	Account result = dao.findByLogin(login);
    	if (result != null &&
    			result.getUserId().contentEquals("minato") &&
    			result.getPass().contentEquals("1234") &&
    			result.getMail().contentEquals("minato@sukkiri.com") &&
    			result.getName().contentEquals("湊　雄輔") &&
    			result.getAge() == 23) {
    		System.out.println("testFindByLogin1:成功しました。");
    	} else {
    		System.out.println("testFindByLogin1:失敗しました。");
    	}
    }

    public static void testFindByLogin2() {
    	Login login = new Login("minato", "12345");
    	AccountDAO dao = new AccountDAO();
    	Account result = dao.findByLogin(login);
    	if (result == null) {
    		System.out.println("testFindByLogin1:成功しました。");
    	} else {
    		System.out.println("testFindByLogin1:失敗しました。");
    	}
    }
}
