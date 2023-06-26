package model;
import java.io.Serializable;

public class Users implements Serializable {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String gender;
	private String address;
	private String birth;
	private String height;
	private String weight;
	private String management;
	private String img;

	public Users(String id, String pw, String name, String email, String gender, String address,String birth, String height, String weight, String management,String img) {
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
		this.img = img;
	}
	public Users() {
		super();
		this.id = "";
		this.pw = "";
		this.name = "";
		this.email = "";
		this.gender = "";
		this.address = "";
		this.birth = "";
		this.height = "";
		this.weight = "";
		this.management = "";
		this.img = "";
	}

	public Users(String id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getBirth() {
		return birth;
	}
	public String getHeight() {
		return height;
	}
	public String getWeight() {
		return weight;
	}
	public String getManagement() {
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
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void setManagement(String management) {
		this.management = management;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

}