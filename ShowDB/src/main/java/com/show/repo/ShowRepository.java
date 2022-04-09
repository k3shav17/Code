package com.show.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.show.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {

	List<Show> findAllByReleaseYear(int year);

	List<Show> findAllShowByDirectorIgnoreCase(String director);

//	Iterable<Show> findAllShowSortedByReleaseYear();

}
