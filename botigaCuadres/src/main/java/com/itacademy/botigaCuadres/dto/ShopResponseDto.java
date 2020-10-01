package com.itacademy.botigaCuadres.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Table(name="shops")
public class ShopResponseDto extends ResponseDTO {
	
	@Id
	private String shopName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="shopName")
	private Set<PaintingResponseDto> paints;

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Set<PaintingResponseDto> getPaints() {
		return paints;
	}

	public void setPaints(Set<PaintingResponseDto> paints) {
		this.paints = paints;
	}
	
	

}
