package com.book.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "Book")
public class Book {

	private int id;
	private String bookName;
	private String authorName;
	private String location;
	private String imageLink;
	private String language;
	private int pages;
	private int year;

}
