package com.show.controller;

import java.util.List;

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
@RequestMapping("/show/search")
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
			@RequestParam(defaultValue = "4") Integer pageSize, @RequestParam(defaultValue = "title") String sortBy) {

		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
		return showRepository.findAll(paging);
	}

	@GetMapping("/year/{year}")
	public @ResponseBody Iterable<Show> getByYear(@PathVariable int year) {

		return showRepository.findAllByReleaseYear(year);
	}

//	@GetMapping("/actor/{actor}/director/{director}")
//	public @ResponseBody Iterable<Show> getByActorAndDirector(@PathVariable String actor,
//			@PathVariable String director) {
//
////		return showRepository.findAllShowByActorsAndDirector(actor, director);
//
//		return showRepository.byActorNameAndDirector(actor, director);
//	}

	@GetMapping("/getallby/year")
	public @ResponseBody Iterable<Show> getShowsSortedByYear(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "4") Integer pageSize,
			@RequestParam(defaultValue = "releaseYear") String sortBy) {

		Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

		return showRepository.findAll(paging);
	}

	@GetMapping("/director/{director}")
	public @ResponseBody List<Show> getByDirectorName(@PathVariable String director) {

		return showRepository.findAllShowByDirectorIgnoreCase(director);
	}

}
