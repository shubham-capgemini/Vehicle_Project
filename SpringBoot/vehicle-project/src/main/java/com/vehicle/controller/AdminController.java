package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.entity.VehicleEntity;
import com.vehicle.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class AdminController {
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping(value="/savevehicle")
	public VehicleEntity addVehicleEntity(@RequestBody VehicleEntity vehicle) {
		return vehicleService.addVehicle(vehicle);
	}

	@GetMapping(value = "/getallvehicle")
	public List<VehicleEntity> getAllVehicle(){
		return vehicleService.getAllVehicle();
	}
	
	@PutMapping(value = "/{id}")
	public VehicleEntity updateAnVehicleEntity(@PathVariable int id,@RequestBody VehicleEntity vehicle) {
		return vehicleService.updatVehicle(vehicle, id);
	}
	
	@DeleteMapping(value = "/{id}")
	public String deleteAnVehicleEntity(@PathVariable int id) {
		return vehicleService.deleteVehicle(id);
	}
}
