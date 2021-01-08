package HomeWork9;

public class HomeWork9_01 {
	public static void main(String[] args) {
		Player player = new Player("饅頭人", 10);
		Player player2 = new Player("詹姆士", 10);
		Thread tp1 = new Thread(player);
		Thread tp2 = new Thread(player2);
		tp1.start();
		tp2.start();
		System.out.println("=====大胃王比賽開始=====");
		Player.start = true;
		try {
			tp1.join();
			tp2.join();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("比賽中斷");
		}
		System.err.println("=====比賽結束=====");
	}
}
