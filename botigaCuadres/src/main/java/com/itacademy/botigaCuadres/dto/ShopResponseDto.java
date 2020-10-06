package com.itacademy.botigaCuadres.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="shops")
public class ShopResponseDto extends ResponseDTO {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shopId;
	
	@Column(name="shop_name")
	private String name;
	
	@OneToMany(mappedBy="shop", cascade = {
			CascadeType.ALL})
	@JsonIgnore
	private List<PaintingResponseDto> paints;
	
	@Column(name="max_capacity")
	private Integer maxCapacity;

	
	
	
	public ShopResponseDto() {
		super();
	}

	

	public ShopResponseDto(Integer shopId, String name, Integer maxCapacity) {
		super();
		this.shopId = shopId;
		this.name = name;
		this.maxCapacity = maxCapacity;
	}



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

	public List<PaintingResponseDto> getPaints() {
		return paints;
	}

	public void setPaints(List<PaintingResponseDto> paints) {
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
