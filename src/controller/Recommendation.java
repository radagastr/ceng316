package controller;

import java.util.ArrayList;

public class Recommendation {

	private MovieList list = new MovieList();
	private UserMovie mv = new UserMovie();
	private ArrayList<Movie> movies = new ArrayList<Movie>();
	private MovieList recommendationList = new MovieList();
	public MovieList getList() {
		return list;
	}
	public void setList(MovieList list) {
		this.list = list;
	}
	public UserMovie getMv() {
		return mv;
	}
	public void setMv(UserMovie mv) {
		this.mv = mv;
	}
	public Recommendation(MovieList list, UserMovie userMovie) {
		super();
		this.list = list;
		this.mv = userMovie;
	}
	
	public MovieList searchMovie(){
		for(int i = 0; i< list.getMovieList().size(); i++){
			Movie tmpMovie = list.getMovieList().get(i);
			if(isAdded(tmpMovie)){
				recommendationList.setMovieList(movies);
				recommendationList.getMovieList().add(tmpMovie);
			}
		}
		
		return sortMovieList(recommendationList);
	}
	
	private boolean isAdded(Movie tmpMovie){
		
		for(int i = 0 ; i < tmpMovie.getGenre().getGenreList().size() ; i++){
			if(tmpMovie.getGenre().getGenreList().get(i).getGenreName() == mv.getGenre().getGenreName())
				tmpMovie.setRating(tmpMovie.getRating() + 8);
		}
		
		for(int i = 0 ; i < tmpMovie.getTag().getTagList().size() ; i++){
			if(tmpMovie.getTag().getTagList().get(i).getTagName() == mv.getTag().getTagName())
				tmpMovie.setRating(tmpMovie.getRating() + 10);			
		}
		
		for(int i = 0 ; i < tmpMovie.getStar().getStarsList().size() ; i++){
			if(tmpMovie.getStar().getStarsList().get(i).getStarName() == mv.getStar().getStarName())
				tmpMovie.setRating(tmpMovie.getRating() + 4);
		}
		
		if(tmpMovie.getDirector().getDirectorName() == mv.getDirector().getDirectorName())
			tmpMovie.setRating(tmpMovie.getRating() + 5);
		
		if(tmpMovie.getOrigin().getOriginName() == mv.getOrigin().getOriginName())
			tmpMovie.setRating(tmpMovie.getRating() + 7);
		
		if(tmpMovie.getImdbRating() >= mv.getImdbRating())
			tmpMovie.setRating(tmpMovie.getRating() + 6);
		
		if(tmpMovie.getRating() > 0)
			return true;
		return false;
		
	}
	
	private MovieList sortMovieList(MovieList movieList)
	{
		Movie tmpMovie = new Movie();
		boolean swapped = true;
		int j=0;
		while(swapped){
			swapped = false;
			j++;
			for (int i = 0 ; i < movieList.getMovieList().size() -j ; i++){
				if(movieList.getMovieList().get(i).getRating() < movieList.getMovieList().get(i+1).getRating()){
					tmpMovie = movieList.getMovieList().get(i);
					movieList.getMovieList().set(i, movieList.getMovieList().get(i+1));
					movieList.getMovieList().set(i+1, tmpMovie);
					swapped = true;
				}
			}
		}	
		return movieList;
	}
}
