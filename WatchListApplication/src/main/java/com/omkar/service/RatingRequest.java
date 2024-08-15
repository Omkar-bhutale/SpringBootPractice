package com.omkar.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Component
public class RatingRequest {
	String url = "https://www.omdbapi.com/?apikey=eb6096b9&t=" ;
	public Float getMovieRating(String title) {
		try {
			RestTemplate template = new RestTemplate();
			
			ResponseEntity<ObjectNode> responce = template.getForEntity(url+title,ObjectNode.class);
			
			ObjectNode jesonObject = responce.getBody();
			
			return Float.parseFloat(jesonObject.path("imdbRating").asText());
			
		}catch (Exception e) {
			System.out.println("Either move name is not available or api is down" + e.getMessage());
			return null;
		}
	}

}
