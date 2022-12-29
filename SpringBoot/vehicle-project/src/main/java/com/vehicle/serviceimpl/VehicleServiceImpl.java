package com.vehicle.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.entity.VehicleEntity;
import com.vehicle.repository.VehicleRepository;
import com.vehicle.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public VehicleEntity addVehicle(VehicleEntity vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@Override
	public List<VehicleEntity> getAllVehicle() {
		return vehicleRepository.findAll();
	}

	@Override
	public VehicleEntity updatVehicle(VehicleEntity vehicle, int id) {
		VehicleEntity v=vehicleRepository.findById(id).get();
		v.setId(vehicle.getId());
		v.setName(vehicle.getName());
		v.setType(vehicle.getType());
		v.setCost(vehicle.getCost());
		return vehicleRepository.save(v);
	}

	@Override
	public String deleteVehicle(int id) {
		vehicleRepository.deleteById(id);
		return "Vehicle with id "+id+ "has been deleted!!!!";
	}

}
