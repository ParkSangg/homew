package com.yedam.memo;
import java.util.*;
import java.io.*;
public class MemoManager {
	List<Memo> storage = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	MemoManager(){
		readFromFile();
	}
	
	//등록
	public void inputDate() {
		System.out.print("번호입력 =>");
		int no = Integer.parseInt(sc.nextLine());
		System.out.print("날짜입력 =>");
		String date = sc.nextLine();
		System.out.print("내용입력 =>");
		String content = sc.nextLine();
		
		storage.add(new Memo(no,date,content));
		
		
	}
	public void searchDate() {
		System.out.print("날짜기준조회 =>");
		String date = sc.nextLine();
		boolean isYn = false;
		
		for(int i = 0; i < storage.size(); i++) {
			if(date.equals(storage.get(i).getDate())) {
				System.out.println(storage.get(i));
				isYn = true;
			}
		}
		if(!isYn) {
			System.out.println("해당 날짜의 메모가 없습니다.");
		}
	}
	public void deleteDate() {
		System.out.print("번호기준조회 =>");
		int no = Integer.parseInt(sc.nextLine());
		boolean isYn = false;
		
		for(int i = 0; i < storage.size(); i++) {
			if(no == (storage.get(i).getNo())) {
				storage.remove(storage.get(i));
				isYn = true;
			}
		}
		if(!isYn) {
			System.out.println("해당 번호 메모가 없습니다.");
		}
	}
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/memobook.dat");
			ObjectInputStream ois = new ObjectInputStream(fis); 
			
			storage = (List<Memo>) ois.readObject();
			ois.close();
			fis.close();
		} catch(FileNotFoundException | ClassNotFoundException e) {
			
		} catch(IOException e) {
			
		}
	}
	public void storeToFile() throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/temp/memobook.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(storage);
		oos.close();
		fos.close();
	}
}
