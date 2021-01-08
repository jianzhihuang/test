package HomeWork;

import Test.Cube_Exception;

public class HomeWork6_0918_Calculator {
	private int x;
	private int y;
	
	public HomeWork6_0918_Calculator() {
		
	}
	public HomeWork6_0918_Calculator(int x,int y) throws HomeWork6_0918_CalException {
		setpowerXY(x, y);
	}
	public int getpowerX() {
		return x;
		
	}
	public int getpowerY() {
		return y;
	}
	public int powerXY(int x,int y) throws HomeWork6_0918_CalException {
		
			return (int) Math.pow(x, y);
		
	
} 
	public void setpowerXY(int x,int y) throws HomeWork6_0918_CalException {
		 if (x < 0 || y < 0) {
			throw new HomeWork6_0918_CalException("次方為負數,結果回傳不為整數!");
		}else if (x == 0 || y == 0) {
			throw new HomeWork6_0918_CalException(x+"的"+y+"次方沒有意義");
		}else {
			this.x = x;
			this.y = y;
		}
		
		
	}
}
