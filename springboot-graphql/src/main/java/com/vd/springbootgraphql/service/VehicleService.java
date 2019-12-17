/**
 * 
 */
package com.vd.springbootgraphql.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vd.springbootgraphql.models.Vehicle;
import com.vd.springbootgraphql.repository.VehicleRepository;

/**
 * @author vivedesh
 *
 */
@Service
public class VehicleService {

	@Autowired
	private final VehicleRepository vehicleRepository ;
	public VehicleService(final VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository ;
	}
	@Transactional
	public Vehicle createVehicle(final String type,final String modelCode, final String brandName, final String launchDate) {
		final Vehicle vehicle = new Vehicle();
		vehicle.setType(type);
		vehicle.setModelCode(modelCode);
		vehicle.setBrandName(brandName);
		vehicle.setLaunchDate(LocalDate.parse(launchDate));
		return this.vehicleRepository.save(vehicle);
	}
	@Transactional(readOnly = true)
	public List<Vehicle> getAllVehicles(final int count) {
		return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
	}
	@Transactional(readOnly = true)
	public Optional<Vehicle> getVehicle(final int id) {
		return this.vehicleRepository.findById(id);
	}

}
