package controller;

public class Genre {

	private String genreName;
	private int genreInt;
	
	
	
	public Genre() {
		super();
	}
	public Genre(String genreName, int genreInt) {
		super();
		this.genreName = genreName;
		this.genreInt = genreInt;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	public int getGenreInt() {
		return genreInt;
	}
	public void setGenreInt(int genreInt) {
		this.genreInt = genreInt;
	}
	
	
}
