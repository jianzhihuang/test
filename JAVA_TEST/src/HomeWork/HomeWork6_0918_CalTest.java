package HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork6_0918_CalTest {

	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(System.in);
		HomeWork6_0918_Calculator cal = new HomeWork6_0918_Calculator();
		while (true) { 
			try {
				int a;
				int b;
				
				System.out.println("請輸入X的值:");
				a = scanner.nextInt();
				System.out.println("請輸入Y的值:");
				b = scanner.nextInt();
				cal.setpowerXY(a, b);
				System.out.println(a+"的"+b+"次方等於:"+cal.powerXY(a, b));
				break;
				}
			catch (HomeWork6_0918_CalException e) {
							System.out.println(e.getMessage());
							
			}catch (InputMismatchException e) {
			
					System.out.println("輸入格式不對");
					scanner.next();
			}

		}
		}
	}


	
		
	
//	}

	
	


