package controller;

public class UserMovie {
	
	 private Genre genre = new Genre();
	 private Tag tag = new Tag();
	 private Director director = new Director();
	 private Origin origin = new Origin();
	 private Stars star = new Stars();
	 private int year;
	 private int imdbRating;
	 
	 public UserMovie() {
		super();
	}

	 public UserMovie(Genre genre, Tag tag, Director director, Origin origin,
			Stars star, int year, int imdbRating) {
		super();
		this.genre = genre;
		this.tag = tag;
		this.director = director;
		this.origin = origin;
		this.star = star;
		this.year = year;
		this.imdbRating = imdbRating;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
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

	public Stars getStar() {
		return star;
	}

	public void setStar(Stars star) {
		this.star = star;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(int imdbRating) {
		this.imdbRating = imdbRating;
	}
	 
	 
	 
	 

}
