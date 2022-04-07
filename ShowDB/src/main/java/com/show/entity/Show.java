package com.show.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "show")
@Table(name = "show", uniqueConstraints = { @UniqueConstraint(name = "show_title", columnNames = "title") })
public class Show implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "show_sequence", sequenceName = "show_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "show_sequence")
	@Column(name = "id", updatable = false)
	private Integer showId;
	@Column(name = "type", nullable = false, columnDefinition = "TEXT")
	private String type;
	@Column(name = "title", nullable = false, columnDefinition = "TEXT")
	private String title;
	@Column(name = "director", nullable = true, columnDefinition = "TEXT")
	private String director;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "show_actors", joinColumns = {
			@JoinColumn(name = "show_id", table = "show") }, inverseJoinColumns = {
					@JoinColumn(name = "actor_id", table = "actors") })
	private List<Actors> actors;

	@Column(name = "country", nullable = false, columnDefinition = "TEXT")
	private String country;
	private LocalDateTime dateAdded;
	@Column(name = "release_year", nullable = false)
	private int releaseYear;
	@Column(name = "rating", nullable = false, columnDefinition = "TEXT")
	private String rating;
	@Column(name = "duration", nullable = false, columnDefinition = "TEXT")
	private String duration;

	public Integer getShowId() {
		return showId;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<Actors> getActors() {
		return actors;
	}

	public void setActors(List<Actors> actors) {
		this.actors = actors;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDateTime getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
