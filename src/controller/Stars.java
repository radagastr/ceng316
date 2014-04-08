package controller;

public class Stars {

	private int starID;
	private String starName;	
	
	public Stars() {
		super();
	}
	public Stars(String starName,int starID) {
		super();
		
		this.starName = starName;
		this.starID = starID;
	}
	public int getStarID() {
		return starID;
	}
	public void setStarID(int starID) {
		this.starID = starID;
	}
	public String getStarName() {
		return starName;
	}
	public void setStarName(String starName) {
		this.starName = starName;
	}

	
}
