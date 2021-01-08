package HomeWork8;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class Train_main {

	public static void main(String[] args) {
		Train_Test train = new Train_Test();
		// 第一題
		ArrayList<Train> geTrains = train.getTrain();// 讀取火車資訊
		System.out.println("原本火車資訊:");
		Train_Test.forr(geTrains);// 使用for迴圈印出原本火車資訊
		System.out.println("\n==========印出不重複的火車資訊以號碼做比對===========");
		Set<Train> setTrains = new HashSet<Train>();
		setTrains.addAll(geTrains);
		Train_Test.foreachh(setTrains); // 使用foreach印出 set 無法使用for迴圈印出

		// 第二題

		System.out.println("\n原本火車資訊:");
		ArrayList<Train> geTrains1 = train.getTrain();
		Train_Test.Iter(geTrains1);
		Collections.sort(geTrains1);
		System.out.println("\n==========印出以號碼大到小排序===========");
		Train_Test.Iter(geTrains1); // 使用Iterator 印出

		// 第三題
		System.out.println("\n原本火車資訊:");
		ArrayList<Train> geTrains2 = train.getTrain();
		Train_Test.forr(geTrains2);
		System.out.println("\n==========印出以號碼大到小排序並把重複號碼移除===========");
		Set<Train> treeTrains = new TreeSet<Train>();
		treeTrains.addAll(geTrains2);
		Train_Test.foreachh(treeTrains);// 使用foreach 印出 無法使用for迴圈印出

	}
}