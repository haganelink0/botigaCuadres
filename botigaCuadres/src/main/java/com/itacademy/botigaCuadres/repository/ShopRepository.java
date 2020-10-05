package com.itacademy.botigaCuadres.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itacademy.botigaCuadres.dto.ShopResponseDto;

@Repository
public interface ShopRepository extends JpaRepository<ShopResponseDto,String> {

	

}
