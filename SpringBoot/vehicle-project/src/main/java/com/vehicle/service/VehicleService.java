package com.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.vehicle.entity.VehicleEntity;
import com.vehicle.repository.VehicleRepository;

@Component
public interface VehicleService {
public VehicleEntity addVehicle(VehicleEntity vehicle);
public List<VehicleEntity> getAllVehicle();
public VehicleEntity updatVehicle(VehicleEntity vehicle, int id);
public String deleteVehicle(int id);

	
}
