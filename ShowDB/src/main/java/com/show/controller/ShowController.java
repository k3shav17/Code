package com.show.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.show.entity.Show;
import com.show.repo.ShowRepository;

@Controller
@RequestMapping("/show")
public class ShowController {

	@Autowired
	private ShowRepository showRepository;

	@PostMapping("/addshow")
	public @ResponseBody Show addShow(@RequestBody Show show) {

		Show insertingShow = showRepository.save(show);

		return insertingShow;
	}

	@GetMapping("/getall")
	public @ResponseBody Iterable<Show> getAllShows() {
		return showRepository.findAll();
	}
}
