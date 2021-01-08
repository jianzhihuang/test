package HomeWork10;

public class HomeWork10_01 {

	public static void main(String[] args) {
		int num [] = new int [5];
		boolean judge = false;
		for (int i = 0; i < num.length; i++) {
			num[i] = getrandom();
			judge = false;
			
			if (num[i]%2 ==0) {
				judge = true;
				System.out.println(num[i]+"不是質數");
				
			}else {
				judge = false;
				System.out.println(num[i]+"是質數");
			}
		}
		
		
	}

	public static int getrandom() {
		return (int) (Math.random() * 100) + 1;
	}
}
