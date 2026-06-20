package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;

@RestController
public class CarController {

	@Autowired
	private CarService cs;
	
	@GetMapping("display")
	public List<Car> displayCars(){
		return cs.display();
		
	}
	
	@PostMapping("Add")
	public void addCar(Car c) {
		cs.add(c);
	}
}
