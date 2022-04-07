package com.show.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.show.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {

	List<Show> findAllByReleaseYear(int year);

//	@Query(value = "SELECT * FROM Show s WHERE s.actors = 1 AND s.director = 2")
//	List<Show> findShowByActorsAndDirector(String actor, String director);
}
