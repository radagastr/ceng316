package controller;

import java.util.ArrayList;

public class GenreList {
	
	private ArrayList<Genre> genreList = new ArrayList<Genre>();
	
	public GenreList() {
		super();
	}

	public GenreList( ArrayList<Genre> genreList) {
		super();
		this.genreList = genreList;
	}

	public ArrayList<Genre> getGenreList() {
		return genreList;
	}
	public void setGenreList(ArrayList<Genre> genreList) {
		this.genreList = genreList;
	}
	
	
	
	
	
	
	
}
