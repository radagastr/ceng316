package controller;

public class Movie {
 	
 private GenreList genreList = new GenreList();
 private TagList tagList = new TagList();
 private Director director = new Director();
 private Origin origin = new Origin();
 private StarList starList = new StarList();
 private String movieName;
 private int year;
 private int rating = 0;
 private int imdbRating;
 


public Movie() {
	super();
}

public Movie(GenreList genre, TagList tag, Director director, Origin origin,
		StarList star, String movieName, int year,  int imdbRating) {
	super();
	this.genreList = genre;
	this.tagList = tag;
	this.director = director;
	this.origin = origin;
	this.starList = star;
	this.movieName = movieName;
	this.year = year;
	this.imdbRating = imdbRating;
}

public GenreList getGenre() {
	return genreList;
}

public void setGenre(GenreList genre) {
	this.genreList = genre;
}

public TagList getTag() {
	return tagList;
}

public void setTag(TagList tag) {
	this.tagList = tag;
}

public Director getDirector() {
	return director;
}

public void setDirector(Director director) {
	this.director = director;
}

public Origin getOrigin() {
	return origin;
}

public void setOrigin(Origin origin) {
	this.origin = origin;
}

public StarList getStar() {
	return starList;
}

public void setStar(StarList star) {
	this.starList = star;
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public int getImdbRating() {
	return imdbRating;
}

public void setImdbRating(int imdbRating) {
	this.imdbRating = imdbRating;
}



}
