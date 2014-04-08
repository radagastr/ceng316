package controller;

public class Stars {

	private int starID;
	private String starName;	
	
	public Stars() {
		super();
	}
	public Stars(int starID, String starName) {
		super();
		this.starID = starID;
		this.starName = starName;		
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
