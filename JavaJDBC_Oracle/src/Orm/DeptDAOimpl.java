package Orm;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DeptDAOimpl implements DeptDAO {

	private static final String INSERT_STMT = "INSERT INTO DEPARTMENT (DEPTNO, DNAME, LOC) VALUES (?, ?, ?)";

	static {
		try {
			Class.forName(Mydata.DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void add(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(Mydata.URL, Mydata.USER, Mydata.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int deptno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findBydeptno(int deptno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
