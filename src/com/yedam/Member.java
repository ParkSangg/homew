package com.yedam;

public class Member {
	private String id;
	private String pw;
	
	public Member() {
		
	}
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	@Override				//중복값은 마지막으로 들어온 값만 반환
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		if(!(obj instanceof Member)) {
			return false;
		}
		
		if(this.id.equals(member.id) && this.pw.equals(member.pw)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "회원아이디 : " + id + " 비밀번호 : " + pw;
	}
}
