package com.yedam.phonebook;

//PhoneInfo 이름 연락처
//Phonecompany 회사
//PhoneUnivInfo 학교포함
//PhoneBookManager 기능포함

public class PhoneBookApp {
	public static void main(String[] args) {
		PhoneBookManager app = PhoneBookManager.getInstance();
		int menu;
		
		//id,pass : id,password를 입력하세요
		//UserCheck check =new UserCheck()
		//check.loginCheck(id,pw);
		
		
		while (true) {
			try {
				MenuViewer.showMenu();
				menu = MenuViewer.scn.nextInt();
				MenuViewer.scn.nextLine();

				if (menu < INIT_MENU.INPUT || menu > INIT_MENU.EXIT) {
					throw new MenuChoiceException(menu);
				}
				switch (menu) {
				case INIT_MENU.
				case INIT_MENU.INPUT:
					app.inputData();
					break;
				case INIT_MENU.SEARCH:
					app.serchData();
					break;
				case INIT_MENU.DELETE:
					app.deleteData();
					break;
				case INIT_MENU.EXIT:
					app.storeToFile();
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
			}
		}

	}
}
