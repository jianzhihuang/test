package module06_12;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class OutputStreamChain {
	public static void main(String args[]) throws Exception{
//		try {
			FileOutputStream fos = new FileOutputStream("c:\\javawork\\hello233.txt");

			BufferedOutputStream bos = new BufferedOutputStream(fos);

			PrintStream ps = new PrintStream(bos);

			ps.println("Hello World 世界你好222321sadsadsa;'la';lsad';s !");

			ps.close();
			bos.close();
			fos.close();
//		} catch (IOException e) {
//			System.err.println(e);
//		}
	}
}