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

import com.M14_art.DTO.Shop;
import com.M14_art.service.ShopService;

@RestController
@RequestMapping("/shops")
public class ShopController {
	
	@Autowired
	ShopService service;
	
	//create new shop
	@PostMapping("/")
	public Shop createShop(@RequestBody Shop shop){
		return service.createShop(shop);
	}
	
	//read all shops
	@GetMapping("/")
	public List<Shop> readAllShops(){
		return service.readAllShops();
	}
	
	//read 1 shop by id
	@GetMapping("/{id}")
	public Shop readById(@PathVariable (name="id") Long id){
		return service.readById(id);
	}
	
	//read 1 shop by name
	@GetMapping("/name/{name}")
	public List<Shop> readByName(@PathVariable (name="name") String name){
		return service.readByName(name);
	}
	
	//update 1 shop by id
	@PutMapping("/{id}")
	public Shop updateShop(@PathVariable(name="id") Long id, @RequestBody Shop shopUpdated){
		Shop shopToUpdate = service.readById(id);
		shopToUpdate.setName(shopUpdated.getName());
		shopToUpdate.setCapacity(shopUpdated.getCapacity());
		return service.updateById(shopUpdated);
	}
	
	//delete 1 shop by id
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable(name ="id") Long id){
		service.deleteById(id);
	}
	
	//delete all

}