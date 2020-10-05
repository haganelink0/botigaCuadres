package com.itacademy.botigaCuadres.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="shops")
public class ShopResponseDto extends ResponseDTO {
	
	@Id
	@Column(name = "shopid", unique=true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shopId;
	
	@Column(name="ShopName")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="shopid")
	private Set<PaintingResponseDto> paints;
	
	@Column(name="maxCapacity")
	private Integer maxCapacity;

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<PaintingResponseDto> getPaints() {
		return paints;
	}

	public void setPaints(Set<PaintingResponseDto> paints) {
		this.paints = paints;
	}

	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
	public boolean hasSpace() {
		boolean response = false;
		if (maxCapacity > paints.size()) {
			response = true;;
		} 
		return response;
	}
	

}
