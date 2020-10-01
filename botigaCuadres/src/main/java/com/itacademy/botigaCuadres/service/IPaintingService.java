package com.itacademy.botigaCuadres.service;

import com.itacademy.botigaCuadres.dto.PaintingResponseDto;
import com.itacademy.botigaCuadres.dto.ShopResponseDto;

public interface IPaintingService {
	
	Iterable<PaintingResponseDto>getPaintingByShop(ShopResponseDto shop);
	
	void deleteAllPaintings(ShopResponseDto shop);
	
	void savePainting(PaintingResponseDto painting);

}
