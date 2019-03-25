package model;

public class Employee {
	
	String employeeID;
	String phoneNumber;
	String name;
	String age;
	String mail;
	String language;
	String destination;
	private static int employeeNumber = 10000;
	
	public void generateEmployeeID() {
		if (employeeNumber < 100000) {
			this.employeeID = ("E" + employeeNumber);
			employeeNumber++;
		}
	}
	public String getEmployeeID() {
		return employeeID;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
}
