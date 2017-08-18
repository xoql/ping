package com.javalec.tea_pjt.model.member.dto;

import java.util.Date;

public class MemberDTO {
		private String id;
		private String password;
		private String name;
		private int tel;
		private String email;
		private String adress;
		private int user_level;
		private Date reg_date;	//���� ��¥
		private int user_flag;	//ȸ�� ����(Ż�𿩺�)
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getTel() {
			return tel;
		}
		public void setTel(int tel) {
			this.tel = tel;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public int getUser_level() {
			return user_level;
		}
		public void setUser_level(int user_level) {
			this.user_level = user_level;
		}
		public Date getReg_date() {
			return reg_date;
		}
		public void setReg_date(Date reg_date) {
			this.reg_date = reg_date;
		}
		public int getUser_flag() {
			return user_flag;
		}
		public void setUser_flag(int user_flag) {
			this.user_flag = user_flag;
		}
}
