package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Car;

public interface CarService {

	void add(Car c);
	List<Car> display();
}
