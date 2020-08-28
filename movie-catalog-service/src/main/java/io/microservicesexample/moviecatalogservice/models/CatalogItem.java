package io.microservicesexample.moviecatalogservice.models;

public class CatalogItem {
	
	private String moviename;
	private String genre;
	private String description;
	private int rating;
	
	
	public CatalogItem(String moviename, String genre, String description, int rating) {
		this.moviename = moviename;
		this.genre = genre;
		this.description = description;
		this.rating = rating;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	

}
