package com.vehicle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vehicle.entity.VehicleEntity;
import com.vehicle.repository.VehicleRepository;

@SpringBootApplication
public class VehicleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleProjectApplication.class, args);
	}
	
//	@Bean
	public CommandLineRunner setDemo(VehicleRepository vehicleRepository) {
		return args -> {
			VehicleEntity v=new VehicleEntity();
			//v.setId(1);
			v.setName("BMW");
			v.setType("Car");
			v.setCost(5000000);
			vehicleRepository.save(v);
			
			VehicleEntity v2=new VehicleEntity();
			//v2.setId(1);
			v2.setName("Tata");
			v2.setType("Car");
			v2.setCost(500000);
			vehicleRepository.save(v2);
			
		};
	}

}
