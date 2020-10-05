package com.itacademy.botigaCuadres.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="paints")
public class PaintingResponseDto extends ResponseDTO {
	
	@Id
	@Column(name = "id", unique=true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "title")
	private String title;
	@Column(name = "author")
	private String author;
	@Column(name = "price")
	private Double price;
	@Column(name = "entry_date")
	private String entryDate;
	@ManyToOne
	@JoinColumn(name ="shopid")
	private ShopResponseDto shop;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public ShopResponseDto getShop() {
		return shop;
	}
	public void setShop(ShopResponseDto shop) {
		this.shop = shop;
	}
	
	

}
