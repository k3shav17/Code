package com.spring.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.model.GroceryItem;
import com.spring.mongo.repository.ItemRepository;

@RestController
public class GroceryController {

	@Autowired
	private ItemRepository groceryItemRepo;

	@PostMapping("/addItem")
	public String addGroceryItems(@RequestBody GroceryItem item) {

		String[] nameFormat = item.getName().split(" ");

		String urlFormat = "";
		for (int i = 0; i < nameFormat.length; i++) {
			urlFormat += nameFormat[i];
		}
		item.setName(urlFormat.toLowerCase());
		groceryItemRepo.save(item);
		return "Item has added to the list at " + item.getId();
	}

	@GetMapping("/getItems")
	public List<GroceryItem> showAllGroceryItems() {
		return groceryItemRepo.findAll();
	}

	@GetMapping("/getItems/{name}")
	public GroceryItem getGroceryItemByName(@PathVariable String name) {
		String[] nameFormat = name.split(" ");

		String urlFormat = "";
		for (int i = 0; i < nameFormat.length; i++) {
			urlFormat += nameFormat[i];
		}
		name = urlFormat.toLowerCase();
		return groceryItemRepo.findItemByName(name);

	}

//	@GetMapping("/getItems/{category}")
//	public List<GroceryItem> getItemsByCategory(@PathVariable String category) {
//		return groceryItemRepo.findAll(category);
//	}

	@GetMapping("/getCount")
	public long findCountOfGroceryItems() {
		return groceryItemRepo.count();
	}
}
