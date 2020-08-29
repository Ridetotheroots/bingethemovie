package io.microservicesexample.moviecatalogservice.models;

public class InfoIteam {
	
	private String movieId;
	private String moviename;
	
	//unmarshalled which is something not an object to an object 
	
	public InfoIteam() {
		
	}
	
	public InfoIteam(String movieId, String moviename) {
		this.movieId = movieId;
		this.moviename = moviename;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	
	

}
