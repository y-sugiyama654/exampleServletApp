import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployeeSample {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			// JDBCドライバを読み込み
			Class.forName("org.h2.Driver");

			// データベースへ接続
			conn = DriverManager.getConnection("jdbc:h2:file:C:/data/example", "sa", "");

			// SELECT文を準備
			String sql = "SELECT ID, NAME, AGE FROM EMPLOYEE";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			// SELECTを実行して、結果表(ResultSet)を取得
			ResultSet rs = pStmt.executeQuery();

			// 結果表に格納されたレコードの内容を表示
			while(rs.next()) {

				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");

				// 取得したデータを出力
				System.out.println("ID:" + id);
				System.out.println("NAME:" + name);
				System.out.println("AGE:" + age);
			}

		} catch(SQLException e) {
			// 接続やSQL処理の失敗時の処理
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			// JDBCドライバが見つからない時の処理
			e.printStackTrace();
		} finally {
			// データベースの切断
			if (conn != null) {
				try {
					conn.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
