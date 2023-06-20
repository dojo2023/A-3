package model;
import java.io.Serializable;

public class Topimages implements Serializable{

	private int topid;
	private String topimg;
	private String image;

	public Topimages(int topid, String topimg,String image) {
		super();
		this.topid = topid;
		this.topimg = topimg;
		this.image=image;
   }

	public Topimages(){
		super();
		this.topid= 0;
		this.topimg = "";
		this.image="";

	}
	public int getTopid() {
		return topid;
	}
	public String getTopimg() {
		return topimg;
	}
	public String getimage() {
		return image;
	}
	public void setTopid(int topid) {
		this.topid = topid;
	}
	public void setTopimg(String topimg) {
		this.topimg = topimg;
	}
	public void setimage(String image) {
		this.image = image;
	}

}