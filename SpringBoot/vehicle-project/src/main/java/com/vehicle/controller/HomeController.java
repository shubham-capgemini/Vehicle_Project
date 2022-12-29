package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.VehicleEntity;
import com.vehicle.service.VehicleService;

@RestController
@RequestMapping("/public")
public class HomeController {
	@Autowired
	private VehicleService vehicleService;
	
	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}
	
	@GetMapping("/login")
	public String login() {
		return "This is login Page";
	}
	
	@GetMapping("/register")
	public String register() {
		return "This is register Page";
	}
	
//	@GetMapping(value = "/getallvehicle")
//	public List<VehicleEntity> getAllVehicle(){
//		return vehicleService.getAllVehicle();
//	}
}
