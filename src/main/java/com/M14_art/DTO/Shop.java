package com.M14_art.DTO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="shops")
public class Shop implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer capacity;
	
	@OneToMany(mappedBy="shop")
	public List<Art> art;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public List<Art> getArt() {
		return art;
	}
	public void setArt(List<Art> art) {
		this.art = art;
	}

	public Shop(Long id, String name, Integer capacity, List<Art> art) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.art = art;
	}

	public Shop() {
		super();
	}

	private static final long serialVersionUID = 1L;

}