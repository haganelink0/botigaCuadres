package com.itacademy.botigaCuadres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.itacademy.botigaCuadres.dto.PaintingResponseDto;
import com.itacademy.botigaCuadres.dto.ShopResponseDto;

@Repository
public interface PaintingRepository extends JpaRepository<PaintingResponseDto, Long> {
	
	Iterable<PaintingResponseDto> findByShop(ShopResponseDto shop);
	


}
