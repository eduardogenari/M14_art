package com.M14_art.DTO;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="arts")
public class Art implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String author="unknown";
	private final Calendar date = Calendar.getInstance();
	
	@ManyToOne
	public Shop shop;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Calendar getDate() {
		return date;
	}
	
	public Art(Long id, String title, String author, Shop shop) {
		super();
		this.id = id;
		this.title = title;
		setAuthor(author);
		this.shop = shop;
	}
	
	public Art() {
		super();
	}	
	
	private static final long serialVersionUID = 1L;
}