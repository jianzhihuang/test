package HomeWork10;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class HomeWork10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		String inday = sc.next();
		System.out.println(StrToDate(inday));

	}
	public static Date StrToDate(String str) {
		  
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		   Date date = null;
		   try {
		    date = format.parse(str);
		   } catch (ParseException e) {
		    e.printStackTrace();
		   }
		   return date;
		}
}

