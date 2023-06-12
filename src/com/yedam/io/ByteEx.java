package com.yedam.io;

import java.util.*;
import java.io.*;

public class ByteEx {

	public static void main(String[] args) {
		//입력(InputStream) => 출력(OutputStream)
		try {			
			FileInputStream fis = new FileInputStream("c:/temp/sample.jpg");
			FileOutputStream fos = new FileOutputStream("c:/temp/copy.jpg");
			
			while(true) {
				int readInt = fis.read();
				if(readInt == 1) {
					break;
				}
				fos.write(readInt);
			}
			fis.close();
			fos.flush();
			fos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void read1() {
		try {
			InputStream is = new FileInputStream("c:/temp/date1.dat");

			while (true) {
				int readInt = is.read();
				if (readInt == -1) { // 파일의 끝부분.
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void write() {
		try {
			OutputStream os = new FileOutputStream("c:/temp/date1.dat");
			byte a = 10;
			os.write(a);
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
