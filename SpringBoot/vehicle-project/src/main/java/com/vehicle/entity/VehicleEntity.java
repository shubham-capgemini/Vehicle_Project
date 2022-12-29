package com.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class VehicleEntity {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String type;
private int cost;
public VehicleEntity(String name, String type, int cost) {
	super();
	this.name = name;
	this.type = type;
	this.cost = cost;
}
}
