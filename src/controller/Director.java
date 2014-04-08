package controller;

public class Director {

	
	public String directorName;
	public int directorId;
	public Director(String directorName, int directorId) {
		super();
		this.directorName = directorName;
		this.directorId = directorId;
	}
	public Director() {
		super();
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public int getDirectorId() {
		return directorId;
	}
	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}
	
	
}
