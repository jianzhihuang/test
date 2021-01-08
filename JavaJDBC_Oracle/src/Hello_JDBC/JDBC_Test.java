package Hello_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.crypto.NullCipher;

public class JDBC_Test {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "DAVID";
	private static final String PASSWORD = "123456";
	private static final String SQL = "INSERT INTO DEPARTMENT(DEPTNO,DNAME,LOC) VALUES(?,?,?)";
//	private static final String SQL = "SELECT * FROM  DEPARTMENT";

	public static void main(String[] args) {
		Connection con = null;
		Statement stat = null;
		ResultSet rs = null;
		PreparedStatement psstat = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入部門編號");
		int deptno = scanner.nextInt();
		System.out.println("請輸入部門名子");
		String dname = scanner.next();
		System.out.println("請輸入所在地");
		String loc =scanner.next();
		//記得Sc用完要結束
		scanner.close();
		try {
			// step 1: 載入驅動
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("載入成功");
			// step 2 :建立連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");

//			//使用完要關閉連線請寫在finally一定要執行
//			con.close();

			// step 3:送出Sql指令
			psstat = con.prepareStatement(SQL);
			psstat.setInt(1, deptno);
			psstat.setString(2, dname);
			psstat.setString(3, loc);
			
			psstat.executeUpdate();
			
			
			
			
//			stat = con.createStatement();
//			int count = stat.executeUpdate(SQL);
//			System.out.println("更新" + count + "幾筆資料");
//			stat = con.createStatement();
//			rs = stat.executeQuery(SQL);
//			System.out.println("開始位置:"+rs.getRow());
//			while (rs.next()) {
//				System.out.println(rs.getRow());
//				int deptno = rs.getInt("DEPTNO");
//				String dname = rs.getString("DNAME");
//				String loc = rs.getString("LOC");
//				System.out.println("DEPTNO:" + deptno + " DNAME:" + dname + " LOC:" + loc);
//			}
//			System.out.println("結束位置:"+rs.getRow());

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 請先檢查有沒有連線拿到值
			if (rs != null) {
				try {
					rs.close();
					System.out.println("ResultSet 關閉成功");
				} catch (SQLException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (psstat != null) {
				try {
					psstat.close();
					System.out.println("PreparedStatement 關閉成功");
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
					System.out.println("Connection 關閉成功");
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		}

	}

}
