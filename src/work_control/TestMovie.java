package work_control;

import java.util.ArrayList;

import controller.Director;
import controller.Genre;
import controller.GenreList;
import controller.Movie;
import controller.MovieList;
import controller.Origin;
import controller.Recommendation;
import controller.StarList;
import controller.Stars;
import controller.Tag;
import controller.TagList;
import controller.UserMovie;

public class TestMovie {
	
	public static void main(String[] args){
		

		ArrayList<Genre> tmpGenreList = new ArrayList<Genre>();
		ArrayList<Genre> tmp1GenreList = new ArrayList<Genre>();
		ArrayList<Genre> tmp2GenreList = new ArrayList<Genre>();
		
		ArrayList<Tag> tmpTagList = new ArrayList<Tag>();
		ArrayList<Tag> tmp1TagList = new ArrayList<Tag>();
		
		ArrayList<Stars> tmpStarList = new ArrayList<Stars>();
		ArrayList<Stars> tmp1StarList = new ArrayList<Stars>();
		

		Genre genre1 = new Genre("fantastic" , 0);
		Genre genre2 = new Genre("crime" , 1);
		Genre genre3 = new Genre("mystery" , 2);
		Genre genre4 = new Genre("drama" , 3);
		Genre genre5 = new Genre("action", 4);
		
		tmpGenreList.add(genre1);
		tmpGenreList.add(genre2);
		tmpGenreList.add(genre3);
		tmpGenreList.add(genre4);
		tmp1GenreList.add(genre4);
		tmp1GenreList.add(genre5);
		tmp2GenreList.add(genre1);
		tmp2GenreList.add(genre2);
		
		
		Tag tag1 = new  Tag("murder" , 0);
		Tag tag2 = new  Tag("orc" , 1);
		Tag tag3 = new  Tag("oil" , 2);
		Tag tag4 = new  Tag("fail" , 3);
		Tag tag5 = new  Tag("race" , 4);
		Tag tag6 = new  Tag("drag" , 5);
		Tag tag7 = new  Tag("jury" , 6);
		Tag tag8 = new  Tag("eleminate" , 7);
		
		tmpTagList.add(tag1);
		tmpTagList.add(tag2);
		tmpTagList.add(tag3);
		tmpTagList.add(tag4);
		tmp1TagList.add(tag5);
		tmp1TagList.add(tag6);
		tmp1TagList.add(tag7);
		tmp1TagList.add(tag8);
	
		Stars star1 = new Stars("Brad Pitt", 0 );
		Stars star2 = new Stars("Onur Kapçýk", 1 );
		Stars star3 = new Stars("Reha Kurt", 2 );
		Stars star4 = new Stars("Uður Pýnar",3 );
		
		tmpStarList.add(star1);
		tmpStarList.add(star2);
		tmp1StarList.add(star3);
		tmp1StarList.add(star4);
		
		
		
		
		Movie movie1 = new Movie(new GenreList(tmpGenreList), new TagList(tmpTagList),  new Director("martin" , 0), new Origin("Hollywood" ,0), new StarList(tmpStarList), "Get me", 1999, 8);
		Movie movie2 = new Movie(new GenreList(tmp1GenreList), new TagList(tmp1TagList),  new Director("hans" , 1), new Origin("Hollywood" ,0), new StarList(tmpStarList), "Turn around", 1999, 9);
		Movie movie3 = new Movie(new GenreList(tmp2GenreList), new TagList(tmp1TagList),  new Director("muller" , 2), new Origin("Hollywood" ,0), new StarList(tmpStarList), "Hangover", 1999, 7);
		
		UserMovie userMovie = new UserMovie(new Genre("fantastic" , 0), new Tag("murder" , 0), new Director("martin", 0), new Origin("Hollywood" ,0), new Stars( "emre metin" , 0 ) , 1990, 8);
		
		MovieList tmpList = new MovieList();
		MovieList list = new MovieList();
		list.getMovieList().add(movie1);
		list.getMovieList().add(movie2);
		list.getMovieList().add(movie3);
		

		
		Recommendation recommend = new Recommendation(list, userMovie);
		tmpList = recommend.searchMovie();
		for(int i = 0 ; i < tmpList.getMovieList().size() ; i++){
			System.out.println(tmpList.getMovieList().get(i).getMovieName());
			System.out.println(tmpList.getMovieList().get(i).getRating());
		}
	
		
	}

}
