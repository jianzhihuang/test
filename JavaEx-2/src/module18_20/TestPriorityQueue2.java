package module18_20;

import java.util.*;

class Mycomparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2)*-1; 
	}
	
	
}

public class TestPriorityQueue2 {
	public static void main(String[] args) {
		// 匿名類別語法
//		Comparator<String> c = new Comparator<String>() {
//			public int compare(String a, String b) {
//				return a.compareTo(b) * -1;
//			}
//		};
		Mycomparator c = new Mycomparator();
		PriorityQueue<String> pq = new PriorityQueue<String>(3, c);
		pq.offer("c");
		pq.offer("a");
		pq.offer("b");
		String s;
		while ((s = pq.poll()) != null) {
			System.out.print(s + ", ");
		}
	}
}
