package idv.david.additional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class Test_DELETE_CachedRowSet {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "david";
	private static final String PASSWORD = "123456";
	private static final String SQL = "SELECT * FROM MEMBER WHERE ID = ?";

	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			// 考量更新資料庫內容需設計交易區間，所以得取得connection物件進行設定
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

			CachedRowSet rowset = RowSetProvider.newFactory().createCachedRowSet();
			rowset.setUrl(URL);
			rowset.setUsername(USER);
			rowset.setPassword(PASSWORD);
			rowset.setCommand(SQL);
			rowset.setInt(1, 3);
			// 執行Query，會自動連線，之後再斷線
			rowset.execute();

			while (rowset.next()) {
				rowset.deleteRow();
			}

			// 需先將Auto Commit關閉
			con.setAutoCommit(false);
			// 將rowset物件送進資料庫
			rowset.acceptChanges(con);
			// 設定成功 commit
			con.commit();
			System.out.println("刪除成功！");

			con.setAutoCommit(true);
			con.close();

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

}
