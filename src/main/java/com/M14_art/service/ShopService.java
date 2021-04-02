package com.M14_art.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.M14_art.DAO.IShopDAO;
import com.M14_art.DTO.Shop;

@Service
public class ShopService {
	
	@Autowired
	IShopDAO iShopDAO;
	
	//create new art
	public Shop createShop(Shop shop){ 
		return iShopDAO.save(shop);
	}
	
	//read all shops
	public List<Shop> readAllShops(){ 
		return iShopDAO.findAll();
	}
	
	//read 1 shop by id
	public Shop readById(Long id){
		return iShopDAO.findById(id).get();
	}
	
	//read 1 shop by name
	public List<Shop> readByName(String name){
		return iShopDAO.findByName(name);
	}
	
	//update 1 shop by id
	public Shop updateById(Shop shop){
		return iShopDAO.save(shop);
	}
	
	//delete 1 shop by id
	public void deleteById(Long id){ 
		iShopDAO.deleteById(id);
	}
	
	//delete all

}