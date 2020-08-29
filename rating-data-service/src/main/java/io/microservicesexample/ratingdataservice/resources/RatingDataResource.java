package io.microservicesexample.ratingdataservice.resources;

import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.microservicesexample.ratingdataservice.models.RatingInfo;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {
	
	@RequestMapping("/{movieId}")
	public List<RatingInfo>getRatingInfo(String movieId){
		
		return Collections.singletonList(
				new RatingInfo("1", 4));
		
	}

}
