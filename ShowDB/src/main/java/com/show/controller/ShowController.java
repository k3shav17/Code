package com.show.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public @ResponseBody Iterable<Show> getAllShows(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "10") Integer pageSize, @RequestParam(defaultValue = "title") String sortBy) {

		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		return showRepository.findAll(paging);
	}

	@GetMapping("/search/year/{year}")
	public @ResponseBody Iterable<Show> getByYear(@PathVariable int year) {
		return showRepository.findAllByReleaseYear(year);
	}

//	@GetMapping("/search/castcrew/{actor}/{director}")
//	public @ResponseBody Iterable<Show> getByActorAndDirector(@PathVariable String actor,
//			@PathVariable String director) {
//
//		return showRepository.findShowByActorsAndDirector(actor, director);
//	}
}
