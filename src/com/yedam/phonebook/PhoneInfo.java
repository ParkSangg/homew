package com.yedam.phonebook;

import lombok.Data;

@Data
public class PhoneInfo {
	private String name;
	private String phoneNumber;

	public PhoneInfo(String name, String phone) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public void showPhoneInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phoneNumber);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		PhoneInfo info = (PhoneInfo) obj;
		if (info.name.compareTo(this.name) == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return INPUT_SELECT.NORMAL + "," + name + "," + phoneNumber + "\n";
	}
}
