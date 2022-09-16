package com.graphql.poc.query;

import com.graphql.poc.dao.entity.Vehicle;
import com.graphql.poc.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery  {

    @Autowired
    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count){

        return vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id){

        return vehicleService.getVehicleById(id);
    }
}
