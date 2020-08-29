package io.microservicesexample.moviecatalogservice.resources;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import io.microservicesexample.moviecatalogservice.models.CatalogItem;
import io.microservicesexample.moviecatalogservice.models.InfoIteam;
import io.microservicesexample.moviecatalogservice.models.RatingInfo;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate RestTemplate;
	
	@RequestMapping("/{userId}")
	public List <CatalogItem> getCatalog(@PathVariable("userId")String userId){
		
		//instance
		RestTemplate restTemplate = new RestTemplate();
		// get all related movie IDs
		
		List<RatingInfo> ratings = Arrays.asList(
				new RatingInfo("1", 4),
				new RatingInfo("2234", 5)
				);
		
		final String url = "http://localhost:8082/movies/";
		
		return ratings.stream().map(rating->{
			InfoIteam infoitem = restTemplate.getForObject(url + rating.getMovieId(), InfoIteam.class);
			return new CatalogItem(infoitem.getMoviename(), "Crime drama", "drama", rating.getRatings());
		
		})
		.collect(Collectors.toList());
		
	}

}
