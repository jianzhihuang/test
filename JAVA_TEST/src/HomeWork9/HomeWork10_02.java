package HomeWork9;

class Depot {
	private int price = 0; // 庫存量
	private boolean a = false;
	synchronized public void produce(int qty) {
		while (price > 3000) {
			System.out.println("媽媽看到餘額超過3000，暫停匯款");
			try {
				wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		price += qty;
		System.out.println("媽媽存了" + qty + "，帳戶共有：" + price);
		if (a) {
			System.out.println("雄大被老媽告知帳戶已經有錢");
			notify();
			a = false;
		}
//		notify();
	}

	synchronized public void consume(int qty) {
		while (price < qty) {
			System.out.println("雄大看到帳戶沒錢，停止匯款");
			System.out.println("媽媽被雄大要求匯款！");
			try {
				a = true;
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		a = false;
		price -= qty;
		if (price < 2000) {
			System.out.println("雄大看到餘額在2000以下，要求匯款");
			notify();
		}		
		System.out.println("雄大領了" + qty + "，帳戶共有" + price);
	}
}

class Producer extends Thread {
	Depot depot;

	public Producer(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.produce(3000); // 每次生產4個
	}
}

class Consumer extends Thread {
	Depot depot;

	public Consumer(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			depot.consume(2000); // 每次消費3個
	}
}

public class HomeWork10_02 {
	public static void main(String[] args) {
		Depot depot = new Depot();
		Producer producer = new Producer(depot);
		Consumer consumer = new Consumer(depot);
		producer.start();
		consumer.start();
	}
}
