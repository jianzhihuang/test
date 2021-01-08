package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		while (set.size() != 6) {
			int a= (int)(Math.random()*49)+1;
			set.add(a);
		}
			Iterator objs = set.iterator();
			while (objs.hasNext()) {
				System.out.println(objs.next());
			}		
				
		
		
		
		
	}

}
