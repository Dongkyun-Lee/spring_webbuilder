package com.company.people.memberdto;

import java.util.Date;

public class PeopleMemberDTO {


		private int userno;
		private String management;
		private String userid;
		private String userpass;
		private Date regDate;
		public int getUserno() {
			return userno;
		}
		public void setUserno(int userno) {
			this.userno = userno;
		}
		public String getUserid() {
			return userid;
		}
		public String getManagement() {
			return management;
		}
		public void setMangement(String management) {
			this.management = management;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getUserpass() {
			return userpass;
		}
		public void setUserpass(String userpass) {
			this.userpass = userpass;
		}
		public Date getRegDate() {
			return regDate;
		}
		public void setRegDate(Date regDate) {
			this.regDate = regDate;
		}

	

}
