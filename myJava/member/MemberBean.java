package member;

import java.beans.JavaBean;

@JavaBean
public class MemberBean { // spring, jsp : dto, vo
	private int num;
	private String name;
	private String phone;
	private String address;
	private String team;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public static void main(String[] args) {
		new MemberBean();
	}

}
