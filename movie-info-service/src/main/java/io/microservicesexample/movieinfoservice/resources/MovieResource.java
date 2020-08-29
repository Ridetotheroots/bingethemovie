package io.microservicesexample.movieinfoservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.microservicesexample.movieinfoservice.models.InfoIteam;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@RequestMapping("/{movieId}")
	public List<InfoIteam> getMovieInfo(@PathVariable("movieId")String movieId){
		return Collections.singletonList(
				new InfoIteam("1", "The Irishman"));
		
	}

}
