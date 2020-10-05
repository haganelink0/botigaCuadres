package com.itacademy.botigaCuadres.service;

import org.springframework.stereotype.Service;

import com.itacademy.botigaCuadres.dto.PaintingResponseDto;
import com.itacademy.botigaCuadres.dto.ShopResponseDto;

@Service
public interface IPaintingService {
	
	Iterable<PaintingResponseDto>getPaintingByShop(ShopResponseDto shop);
	
	void deleteAllPaintings(ShopResponseDto shop);
	
	void savePainting(PaintingResponseDto painting);

}
