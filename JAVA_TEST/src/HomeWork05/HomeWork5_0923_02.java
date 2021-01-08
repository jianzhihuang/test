package HomeWork05;

public class HomeWork5_0923_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	randAvg();
			
	}
	public static void randAvg() {
		int x [] = new int [10];
		int sun = 0;
		
		int rundon =0;
		for (int i = 0; i < x.length; i++) {
			rundon = (int) (Math.random()*100+1);
			sun +=rundon;
			System.out.print(rundon+",");
		}
		System.out.println();
		int a = sun/10;
		System.out.println("平均值:"+a);
		
	
	}
	

}
