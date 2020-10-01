package com.itacademy.botigaCuadres.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itacademy.botigaCuadres.dto.ShopResponseDto;

@Repository
@Transactional
public interface ShopRepository extends JpaRepository<ShopResponseDto,String> {

	

}
