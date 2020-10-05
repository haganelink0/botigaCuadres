package com.itacademy.botigaCuadres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itacademy.botigaCuadres.dto.PaintingResponseDto;
import com.itacademy.botigaCuadres.dto.ShopResponseDto;
import com.itacademy.botigaCuadres.service.impl.PaintingServiceImpl;
import com.itacademy.botigaCuadres.service.impl.ShopServiceImpl;

@RestController
@RequestMapping("/apishop/")
public class ShopController {
	
	ShopServiceImpl shopService;
	PaintingServiceImpl paintingService;

	
	@Autowired
	public ShopController(ShopServiceImpl shopService, PaintingServiceImpl paintingService) {
		this.shopService = shopService;
		this.paintingService = paintingService;
	}
	
	@GetMapping("/shops/")
	public ResponseEntity<Iterable<ShopResponseDto>> viewAllShops() {
		return new ResponseEntity<>(shopService.getAll(), HttpStatus.OK);
		
	}
	
	@PostMapping(path="/shops/", consumes="application/json")
	public void insertShop(ShopResponseDto shop) {
		shopService.insertShop(shop);
	}
	
	@DeleteMapping("/shops/{name}")
	public void deleteShop(@RequestParam String name) {
		ShopResponseDto tempShop = shopService.getShop(name);
		shopService.deleteShop(tempShop);
		paintingService.deleteAllPaintings(tempShop);
	}
	
	@PostMapping(path="/shops/{id}/painting", consumes="application/json")
	public void addPainting(@RequestParam String name, PaintingResponseDto painting) {
		ShopResponseDto tempShop = shopService.getShop(name);
		painting.setShop(tempShop);
		paintingService.savePainting(painting);
	}
	
	@GetMapping("/shops/{id}/painting")
	public ResponseEntity<Iterable<PaintingResponseDto>> viewPaintings(@RequestParam String name) {
		ShopResponseDto tempShop = shopService.getShop(name);
		return new ResponseEntity<>(paintingService.getPaintingByShop(tempShop), HttpStatus.OK);
	}
	

}
