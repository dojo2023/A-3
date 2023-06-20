package model;
import java.io.Serializable;

public class Topimages implements Serializable{

	private int topid;
	private String topimg;
	private String Image;

	public Topimages(int topid, String topimg,String Image) {
		super();
		this.topid = topid;
		this.topimg = topimg;
		this.Image= Image;
   }

	public Topimages(){
		super();
		this.topid= 0;
		this.topimg = "";
		this.Image="";

	}
	public int getTopid() {
		return topid;
	}
	public String getTopimg() {
		return topimg;
	}
	public String getImage() {
		return Image;
	}
	public void setTopid(int topid) {
		this.topid = topid;
	}
	public void setTopimg(String topimg) {
		this.topimg = topimg;
	}
	public void setimage(String Image) {
		this.Image = Image;
	}

}