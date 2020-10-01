package com.itacademy.botigaCuadres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itacademy.botigaCuadres.dto.ShopResponseDto;
import com.itacademy.botigaCuadres.service.impl.ShopServiceImpl;

@RestController
@RequestMapping("/apishop/")
public class ShopController {
	
	ShopServiceImpl service;
	
	@Autowired
	public ShopController(ShopServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping("/shops/")
	public ResponseEntity<Iterable<ShopResponseDto>> viewAllShops() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		
	}
	

}
