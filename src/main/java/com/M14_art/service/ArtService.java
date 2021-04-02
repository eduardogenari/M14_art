package com.M14_art.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.M14_art.DAO.IArtDAO;
import com.M14_art.DTO.Art;

@Service
public class ArtService {
	
	@Autowired
	IArtDAO iArtDAO;
	
	//create new art
	public Art createArt(Art art){ 
		return iArtDAO.save(art);
	}

	//read all arts
	public List<Art> readAllArts(){ 
		return iArtDAO.findAll();
	}
	
	//read 1 art by id
	public Art readById(Long id){
		return iArtDAO.findById(id).get();
	}
	
	//read 1 art by title
	public List<Art> readByTitle(String title){
		return iArtDAO.findByTitle(title);
	}
	
	//update 1 art by id
	public Art updateById(Art art){
		return iArtDAO.save(art);
	}
	
	//delete 1 art by id
	public void deleteById(Long id){ 
		iArtDAO.deleteById(id);
	}
	
	//delete all
}