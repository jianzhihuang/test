package Orm;

import java.util.Scanner;

public class Test_JDBCDAO {

	public static void main(String[] args) {
		// 模擬輸入要新增的部門資料
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入部門編號");
		int deptno = sc.nextInt();
		System.out.println("請輸入部門名稱");
		String dname = sc.next();
		System.out.println("請輸入所在地");
		String loc = sc.next();

		sc.close();
		
		Dept dept = new Dept(deptno, dname, loc); //用部門bean包裝著要新增的部門資料
		DeptDAOimpl  dao = new DeptDAOimpl(); //產生部門的dao物件,準備部門的表格進行操作
		dao.add(dept);
		
		System.out.println("新增成功");
		
		
	}
	

}
