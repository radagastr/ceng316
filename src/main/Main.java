package main;

import java.sql.SQLException;

import mySQL.MySQLPersistence;
import controller.*;

public class Main {
	
	/*In the first iteration we don't connect between java and database.
	 * in order to make practice and test we hard coded with old style main,
	 * create sample movies, genre etc.. then create user movie.
	 * after that, compare user movie in our movie list. 
	 * */
	
	public static void main(String[] args) throws SQLException{
		
		MySQLPersistence connection = new MySQLPersistence();
		
		int i;
		/*
		for(i = 0; i < connection.getAllMovie().getMovieList().size(); i++){
				System.out.printf(connection.getAllMovie().getMovieList().get(i).getMovieName() + " is played ");
				for(int j = 0; j<connection.getAllMovie().getMovieList().get(i).getStar().getStarsList().size();j++)
					System.out.printf(connection.getAllMovie().getMovieList().get(i).getStar().getStarsList().get(j).getStarName() + " and ");
				System.out.printf("directed by ");
				System.out.println(connection.getAllMovie().getMovieList().get(i).getDirector().getDirectorName());
		}
		
		System.out.println();
		System.out.println();
		
		for(i = 0 ; i < connection.getAllMovie().getMovieList().size(); i++){
			System.out.printf(connection.getAllMovie().getMovieList().get(i).getMovieName() + " is tag names' ");
			for(int j = 0 ; j < connection.getAllMovie().getMovieList().get(i).getTag().getTagList().size();j++)
				System.out.printf(connection.getAllMovie().getMovieList().get(i).getTag().getTagList().get(j).getTagName() + ",");
			System.out.println();
		}
		*/
		
		UserMovie userMovie = new UserMovie(new Genre("Drama" , 1), new Tag("boxer" , 1), new Director("martin", 1), new Origin("Hollywood" ,1), new Stars( "Brad Pitt" , 1 ) , 1999, 8);
		Recommendation recommend = new Recommendation(connection.getAllMovie(), userMovie);
		MovieList tmpList = recommend.searchMovie();
		for(i = 0 ; i < tmpList.getMovieList().size() ; i++){
			System.out.print(tmpList.getMovieList().get(i).getMovieName() + " get ");
			System.out.println(tmpList.getMovieList().get(i).getRating() + " score!");

		}

	}

}
