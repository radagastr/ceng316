package controller;

public class Tag {

	private String tagName;
	private int tagID;
	
	public Tag() {
		super();
	}

	public Tag(String tagName, int tagID) {
		super();
		this.tagName = tagName;
		this.tagID = tagID;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getTagID() {
		return tagID;
	}

	public void setTagID(int tagID) {
		this.tagID = tagID;
	}
	
	
	
}
