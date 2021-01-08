package module06_12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class WriterChain {
	public static void main(String args[]) {
		try {
			FileWriter fw = new FileWriter("c:\\javawork\\hello2.txt",true);
			FileInputStream fStream = new FileInputStream("c:\\javawork\\hello2.txt");
			System.out.println(fStream.available());
			BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter pw = new PrintWriter(bw);

			pw.println("Hello World 世界你好2 !");
			// pw.write("Hello World 世界你好2 !"); //也可使用
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
