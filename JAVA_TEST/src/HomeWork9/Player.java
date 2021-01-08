package HomeWork9;

public class Player implements Runnable {
	private int count;
	private String name;
	Thread thread;
	public static boolean start = false; // 開跑數值

	public Player() {
		super();

	}

	public Player(String name, int count) {
		super();
		this.name = name;
		this.count = count;
		this.thread = new Thread(this, name);

	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while (!start) {
			int i = 1;
			while (i <= count) {
				System.out.println(getName() + "吃了第" + i + "碗");
				try {
					Thread.sleep((long) (Math.random() * 2501 + 500));
					i++;
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("有人拉肚子");
				}
			}
			System.out.println(getName() + "吃完了");
		}
	}

}
