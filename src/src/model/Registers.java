package model;

import java.io.Serializable;

public class Registers implements Serializable {

	private String id;
	private String[] clothes;
	private String subOuter;
//	private String jacket;
	private String subTops;
//	private String polo;
//	private String knit;
//	private String vest;
//	private String cardigan;
	private String subBottoms;
//	private String slacks;
//	private String tapered;
//	private String skinny;
//	private String chino;
//	private String longskirt;
	private String subDress;
//	private String jumperdress;
//	private String kneedress;
	private String subShoes;
//	private String loafre;
//	private String sneaker;
//	private String boots;
//	private String slip;
	private String subAcce;
//	private String piercr;
//	private String earring;
//	private String belt;
//	private String spring;
	private String[] tag;
	private String img;
	private String gender;



	public Registers() {
		this.id = "";
		this.clothes = new String[0];
		this.subOuter = "";
		this.subTops = "";
		this.subBottoms = "";
		this.subDress = "";
		this.subShoes = "";
		this.subAcce = "";
		this.tag = new String[0];
		this.img = "";
		this.gender="";
	}

	public Registers(String id, String[] clothes, String subOuter, String subTops, String subBottoms, String subDress,
			String subShoes, String subAcce, String[] tag, String img ,String gender) {
		super();
		this.id = id;
		this.clothes = clothes;
		this.subOuter = subOuter;
		this.subTops = subTops;
		this.subBottoms = subBottoms;
		this.subDress = subDress;
		this.subShoes = subShoes;
		this.subAcce = subAcce;
		this.tag = tag;
		this.img = img;
		this.gender=gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getClothes() {
		return clothes;
	}

	public void setClothes(String[] clothes) {
		this.clothes = clothes;
	}

	public String getSubOuter() {
		return subOuter;
	}

	public void setSubOuter(String subOuter) {
		this.subOuter = subOuter;
	}

	public String getSubTops() {
		return subTops;
	}

	public void setSubTops(String subTops) {
		this.subTops = subTops;
	}

	public String getSubBottoms() {
		return subBottoms;
	}

	public void setSubBottoms(String subBottoms) {
		this.subBottoms = subBottoms;
	}

	public String getSubDress() {
		return subDress;
	}

	public void setSubDress(String subDress) {
		this.subDress = subDress;
	}

	public String getSubShoes() {
		return subShoes;
	}

	public void setSubShoes(String subShoes) {
		this.subShoes = subShoes;
	}

	public String getSubAcce() {
		return subAcce;
	}

	public void setSubAcce(String subAcce) {
		this.subAcce = subAcce;
	}

	public String[] getTag() {
		return tag;
	}

	public void setTag(String[] tag) {
		this.tag = tag;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

