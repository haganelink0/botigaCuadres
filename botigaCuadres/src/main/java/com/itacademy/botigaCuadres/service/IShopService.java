package com.itacademy.botigaCuadres.service;

import com.itacademy.botigaCuadres.dto.ShopResponseDto;

public interface IShopService {
	
	ShopResponseDto getShop(String name);
	
	Iterable<ShopResponseDto> getAll();
	
	void insertShop(ShopResponseDto shop);
	
	void deleteShop(ShopResponseDto shop);
	
	

}
