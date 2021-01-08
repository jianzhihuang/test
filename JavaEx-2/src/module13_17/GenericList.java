package module13_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		List<Float> data = new ArrayList<Float>();
//		data.add("Hello");
//		data.add("World");
		data.add(1.2f);
		Iterator<Float> it = data.iterator();
		while (it.hasNext()) {
//			String str = it.next(); // 強制轉型,不再需要
			System.out.println(it.next());
		}
	}

}
