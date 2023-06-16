package model;
import java.io.Serializable;

public class Users implements Serializable {
	private String id;
	private String pw;
	private String name;
	private String email;
	private int gender;
	private String address;
	private String birth;
	private int height;
	private int weight;
	private int management;

	public Users(String id, String pw, String name, String email, int gender, String address,
			String birth, int height, int weight, int management) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.birth = birth;
		this.height = height;
		this.weight = weight;
		this.management = management;
	}
	public Users() {
		super();
		this.id = "";
		this.pw = "";
		this.name = "";
		this.email = "";
		this.gender = 0;
		this.address = "";
		this.birth = "";
		this.height = 0;
		this.weight = 0;
		this.management = 0;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getBirth() {
		return birth;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public int getManagement() {
		return management;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setManagement(int management) {
		this.management = management;
	}

}