package Test;

import java.util.Scanner;

public class IDTest {

	public static void main(String[] args) {
		String regex = "[A-Z][1-2]{1}\\d{8}";
		Scanner scanner = new Scanner(System.in);
		String iD = scanner.next();
		if (iD.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("No good...");
		}
	}

}
