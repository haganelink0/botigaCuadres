package com.itacademy.botigaCuadres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itacademy.botigaCuadres.dto.PaintingResponseDto;
import com.itacademy.botigaCuadres.dto.ShopResponseDto;

public interface PaintingRepository extends JpaRepository<PaintingResponseDto, Integer> {
	
	Iterable<PaintingResponseDto> findByShop(ShopResponseDto shop);
	


}
