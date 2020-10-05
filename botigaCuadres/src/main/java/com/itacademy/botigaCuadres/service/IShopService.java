package com.itacademy.botigaCuadres.service;

import org.springframework.stereotype.Service;

import com.itacademy.botigaCuadres.dto.ShopResponseDto;

@Service
public interface IShopService {
	
	ShopResponseDto getShop(String name);
	
	Iterable<ShopResponseDto> getAll();
	
	void insertShop(ShopResponseDto shop);
	
	void deleteShop(ShopResponseDto shop);
	
	

}
