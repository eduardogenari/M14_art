package com.M14_art.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.M14_art.DTO.Art;

public interface IArtDAO extends JpaRepository<Art, Long> {
	
	//find by title contains
	public List<Art> findByTitle(String title); 
	
	//find by author contains
	public List<Art> findByAuthor(String author);	
	
	//find by shop name contains
	public List<Art> findByShopName(String name);	

}