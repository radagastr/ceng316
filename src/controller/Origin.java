package controller;

public class Origin {
	
	private String originName;
	private int originID;
	
	public Origin() {
		super();
	}

	public Origin(String originName, int originID) {
		super();
		this.originName = originName;
		this.originID = originID;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public int getOriginID() {
		return originID;
	}

	public void setOriginID(int originID) {
		this.originID = originID;
	}
	
	

}
