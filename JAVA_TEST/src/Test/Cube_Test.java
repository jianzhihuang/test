package Test;

//import java.util.Scanner;



public class Cube_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cube cb =  new Cube();
//		Scanner scanner = new Scanner(System.in);
//		double a = scanner.nextDouble();
		
		try {
			Cube cb =  new Cube(5);
			System.out.println(cb.print());
		} catch (Cube_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
