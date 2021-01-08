package HomeWork8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Train_Test {
	private final Train taTrain1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
	private final Train taTrain2 = new Train(1254, "區間", "屏東", "基隆", 700);
	private final Train taTrain3 = new Train(118, "自強", "高雄", "台北", 500);
	private final Train taTrain4 = new Train(1288, "區間", "新竹", "基隆", 400);
	private final Train taTrain5 = new Train(122, "自強", "台中", "花蓮", 400);
	private final Train taTrain6 = new Train(1222, "區間", "樹林", "七堵", 300);
	private final Train taTrain7 = new Train(1254, "區間", "屏東", "基隆", 700);

	public ArrayList<Train> getTrain() {
		ArrayList<Train> trainInfo = new ArrayList<Train>();
		trainInfo.add(taTrain1);
		trainInfo.add(taTrain2);
		trainInfo.add(taTrain3);
		trainInfo.add(taTrain4);
		trainInfo.add(taTrain5);
		trainInfo.add(taTrain6);
		trainInfo.add(taTrain7);
		return trainInfo;
	}

	public static void Iter(Collection<Train> aList) {
		Iterator<Train> it = aList.iterator();
		Train obj;
		while (it.hasNext()) {
			obj = it.next();
			System.out.println(obj);
		}
	}

	public static void forr(Collection<Train> aList) {
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(((ArrayList<Train>) aList).get(i));
		}
	}

	public static void foreachh(Collection<Train> aList) {
		for (Train object : aList) {
			System.out.println(object);
		}
	}
}
