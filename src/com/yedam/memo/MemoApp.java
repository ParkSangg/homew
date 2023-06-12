package com.yedam.memo;

import java.util.*;

public class MemoApp {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int choice;

		MemoManager app = new MemoManager();

		while (true) {
			try {
				System.out.println("1.등록 2.검색 3.삭제 4.종료");
				System.out.print("선택 =>");
				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case MENU.INSERT:
					app.inputDate();
					break;
				case MENU.SEARCH:
					app.searchDate();
					;
					break;
				case MENU.DELETE:
					app.deleteDate();
					break;
				case MENU.EXIT:
					app.storeToFile();
					throw new ExitException();
				}
			} catch (ExitException e) {
				break;
			}
		}
		sc.close();
	}

}
