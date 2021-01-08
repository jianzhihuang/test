package HomeWork05;

import java.util.Scanner;

public class HomeWork5_0918_01 {
	private static int width = 0;
	private static int height = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   width = getstra();//輸入寬
	   height = getstrb();//輸入長
	   starSquare(width, height);//利用方法帶入寬跟長
	}
	public static void starSquare(int width,int height) {
		// TODO Auto-generated method stub//進行輸出
      for (int i = 0; i < height; i++) {
		for (int j = 0; j < width; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
    
	}
	public static  int getstra() {
		Scanner scanner = new Scanner(System.in);
		width = scanner.nextInt();
		return width;
	}
	public static  int getstrb() {
		Scanner scanner = new Scanner(System.in);
		height = scanner.nextInt();
		return height;
	}
}
