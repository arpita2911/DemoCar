package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository cr;
	
	@Override
	public void add(Car c) {
		// TODO Auto-generated method stub
		cr.save(c);

	}

	@Override
	public List<Car> display() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

}
