package com.yedam.io;
import java.io.*;
public class BufferEx {

	public static void main(String[] args) {

	}
	//읽고 쓰고하는 버퍼 성능을 향상시킨다
	public static void bufferStream() throws IOException {
		FileInputStream fis = new FileInputStream("c:/temp/vscode.exe");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("c:/temp/copy2.exe");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while(true) {
			int readBuf = bis.read(); //읽어들인 값을 버퍼에 저장
			if(readBuf == -1) {
				break;
			}
			bos.write(readBuf);
		}
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
}
