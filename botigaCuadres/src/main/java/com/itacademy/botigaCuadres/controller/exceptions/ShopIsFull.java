package com.itacademy.botigaCuadres.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INSUFFICIENT_STORAGE)
public class ShopIsFull extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ShopIsFull(String message) {
		super(message);
	}

}
