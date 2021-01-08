package HOMEWORK4;



public class HomeWork6_0923 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][] grade = {  
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}
		
				};
		int stNum [] = new int [6];
		int time [] = new int [8];
		for (int i = 0; i < 6; i++) {
			stNum[i]=best(grade[i]);
			time[stNum[i]-1]++;
		}
		
		for (int i = 0; i < 8; i++) {
			System.out.println(i+1+"號同學最高分"+time[i]+"次");
		}
		}
	//	把陣列傳入
	public static int  best(int grade[]) {
		  int max =0;
		  int mj=0;
			
				for (int j = 0; j < grade.length; j++) {
					if (grade[j]>max) {
						max = grade[j];
						
						mj = j+1;
					}
					
				}
				return mj;//幾號同學最高分
				
		}



		


}
