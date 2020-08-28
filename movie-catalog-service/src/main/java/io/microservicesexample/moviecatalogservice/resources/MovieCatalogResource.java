package io.microservicesexample.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.microservicesexample.moviecatalogservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@RequestMapping("/{userId}")
	public List <CatalogItem> getCatalog(@PathVariable("userId")String userId){
		
		return Collections.singletonList(
				new CatalogItem("The Irishman","Crime drama","Spanning the lives of its mobsters over multiple decades, The Irishman pulls off a 3-and-a-half-hour crime saga. But don't worry -- you can break up this tour de force if you need to. Always clever and entertaining, with Martin Scorsese favorites Robert De Niro, Al Pacino and Joe Pesci commanding the screen, The Irishman creeps up on you, offering a haunting look at ageing mobsters and the havoc they wreak.",4)
		);
		
	}

}
