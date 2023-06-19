package model;
import java.io.Serializable;

public class Topimages implements Serializable{

	private int topid;
	private String topimg;

	public Topimages(int topid, String topimg) {
		super();
		this.topid = topid;
		this.topimg = topimg;
   }

	public Topimages(){
		super();
		this.topid= 0;
		this.topimg = "";

	}
	public int getTopid() {
		return topid;
	}
	public String getTopimg() {
		return topimg;
	}
	public void setTopid(int topid) {
		this.topid = topid;
	}
	public void setTopimg(String topimg) {
		this.topimg = topimg;
	}

}