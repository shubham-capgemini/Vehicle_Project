package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.entity.VehicleEntity;


public interface VehicleRepository extends JpaRepository<VehicleEntity, Integer> {

}
