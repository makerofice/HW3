package model;

import java.io.Serializable;

public class Member implements Serializable{
	private Integer id;
	private String name;
	private String birth;
	private String identify;
	private String address;
	private String phone;
	private String email;
	private String company;
	private String income;
	private String purpose;
	private String account;
	private String password;
	
	public Member() 
	{
		super();
	}
	
	public Member(String name, String birth, String identify, String address, String phone, String email,
			String company, String income, String purpose, String account, String password) {
		super();
		this.name = name;
		this.birth = birth;
		this.identify = identify;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.company = company;
		this.income = income;
		this.purpose = purpose;
		this.account = account;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}