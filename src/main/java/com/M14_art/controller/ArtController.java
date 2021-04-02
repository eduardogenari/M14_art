package com.M14_art.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.M14_art.DTO.Art;
import com.M14_art.service.ArtService;

@RestController
@RequestMapping("/arts")
final class ArtController {
	
	@Autowired
	ArtService service;
	
	//create new art
	@PostMapping("/")
	public Art createArt(@RequestBody Art art){
		return service.createArt(art);
	}
	
	//read all arts
	@GetMapping("/")
	public List<Art> readAllArts(){
		return service.readAllArts();
	}
	
	//read 1 art by id
	@GetMapping("/{id}")
	public Art readById(@PathVariable (name="id") Long id){
		return service.readById(id);
	}
	
	//read 1 art by title
	@GetMapping("/title/{title}")
	public List<Art> readByTitle(@PathVariable (name="name") String title){
		return service.readByTitle(title);
	}
	
	//update 1 art by id
	@PutMapping("/{id}")
	public Art updateArt(@PathVariable(name="id") Long id, @RequestBody Art artUpdated){
		Art artToUpdate = service.readById(id);
		artToUpdate.setTitle(artUpdated.getTitle());
		artToUpdate.setAuthor(artUpdated.getAuthor());
		artToUpdate.setPrice(artUpdated.getPrice());
		return service.updateById(artUpdated);
	}
	
	//delete 1 art by id
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable(name ="id") Long id){
		service.deleteById(id);
	}
	
	//delete all	
	
}
