package io.microservicesexample.movieinfoservice.models;

public class InfoIteam {
	
	private int movieId;
	private String moviename;
	public InfoIteam(int movieId, String moviename) {
		super();
		this.movieId = movieId;
		this.moviename = moviename;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	
	

}
