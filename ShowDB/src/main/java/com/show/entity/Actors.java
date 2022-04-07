package com.show.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "actors")
public class Actors implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long actorId;

	@Column(name = "actor_name", nullable = true, columnDefinition = "TEXT")
	private String actorName;

	public Long getActorId() {
		return actorId;
	}

	public void setActorId(Long actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

//	public List<Show> getShows() {
//		return shows;
//	}
//
//	public void setShows(List<Show> shows) {
//		this.shows = shows;
//	}

}
