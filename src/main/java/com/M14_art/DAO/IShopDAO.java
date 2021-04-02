package com.M14_art.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.M14_art.DTO.Shop;

public interface IShopDAO extends JpaRepository<Shop, Long> {
	
	//find by name
	public List<Shop> findByName(String name); 

}