package HomeWork7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class HomeWork7_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fi = new File("C:\\TEA102_Workspace\\JAVA_TEST\\src\\HomeWork7\\Sample.txt");
		FileInputStream fiin = null;
		BufferedInputStream bin = null;
		Reader rd = null;
		BufferedReader brd = null;
		try {
			//讀取位元組
			fiin =new FileInputStream(fi);
			bin =new BufferedInputStream(fiin);
			
			
			//讀取字元//讀取幾列資料
			
			int countline = 0;
			int countchar = 0;
			String str;
			rd = new FileReader(fi);
			brd = new BufferedReader(rd);
			
			while (brd.read()!=-1) {
				str = brd.readLine();
				countchar +=  str.length();
				countline++;
			}
			
						
			//印出資料
			System.out.println("Sample.txt的檔案大小:"+bin.available()+"位元組");
			System.out.println(countchar+"個字元");
			System.out.println(countline+"列資料");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				brd.close();
				rd.close();
				bin.close();
				fiin.close();
				System.out.println("=====================");
				System.out.println("關閉成功");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}
