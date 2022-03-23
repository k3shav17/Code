package com.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookRepo;

	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {	
		bookRepo.save(book);
		return "Book saved with id " + book.getId();
	}

	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return bookRepo.findAll();
	}

	@GetMapping("/getBooks/{id}")
	public Optional<Book> getBookById(@PathVariable int id) {
		return bookRepo.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookRepo.deleteById(id);
		return "Book has been deleted with id of " + id;
	}
}
