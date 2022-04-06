package com.show.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.show.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {

}
