package module21_26;

public class TEST implements Runnable {
	int counter = 20;

	public TEST() {
	} // 建構者函數
	
	public void run() { // 執行緒執行的地方
		while (counter > 0) {
			System.out.println(counter);
			counter--;

			try {
				Thread.sleep(1000); // 暫停一秒
			} catch (Exception e) {
			}
		}
	}
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}


//	public static void main(String arg[]) {
//		TEST r1 = new TEST();// 產生Runnable物件
//		Thread t1 = new Thread(r1); // 再由Runnable物件, 產生執行緒Thread物件
//		TEST r2 = new TEST();
//		Thread t2 = new Thread(r2);
//		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
//		t2.start();
//	}
}
