package com.itacademy.botigaCuadres.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itacademy.botigaCuadres.dto.PaintingResponseDto;
import com.itacademy.botigaCuadres.dto.ShopResponseDto;
import com.itacademy.botigaCuadres.repository.PaintingRepository;
import com.itacademy.botigaCuadres.service.IPaintingService;

@Service
public class PaintingServiceImpl implements IPaintingService {
	
	private final PaintingRepository repository;
	
	@Autowired
	public PaintingServiceImpl(PaintingRepository repository) {
		this.repository = repository;
	}

	@Override
	public Iterable<PaintingResponseDto> getPaintingByShop(ShopResponseDto shop) {
		return repository.findByShop(shop);
	}

	@Override
	public void deleteAllPaintings(ShopResponseDto shop) {
		Iterable<PaintingResponseDto> paintings = repository.findByShop(shop);
		repository.deleteAll(paintings);
		
	}

	@Override
	public void savePainting(PaintingResponseDto painting) {
		repository.save(painting);
		
	}

}
