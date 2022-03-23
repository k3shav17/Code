package com.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

	@GetMapping("/byCity/{country}/{city}")
	public @ResponseBody Object getWeatherByCity(@PathVariable String city, @PathVariable String country) {

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Object> response = restTemplate.getForEntity("https://api.openweathermap.org/data/2.5/weather?q="
				+ city + "&appid=API_KEY", Object.class);
		return response;
	}

}
