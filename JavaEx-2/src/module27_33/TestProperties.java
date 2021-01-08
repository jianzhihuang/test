package module27_33;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class TestProperties {
	public static void main(String args[]) {
//		System.setProperty("MyProperty", "吳冠宏");  //測試用

		Properties props = System.getProperties();
		Enumeration names = props.propertyNames(); //就像map的keyset

		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			String val = props.getProperty(name);
			System.out.println("property of " + name + " = " + val);
		}
		System.out.println(props.getProperty("java.*"));
	}
	
}
