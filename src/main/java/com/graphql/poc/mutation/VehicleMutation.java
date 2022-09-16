package com.graphql.poc.mutation;

import com.graphql.poc.dao.entity.Vehicle;
import com.graphql.poc.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VehicleMutation {

    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);

    }

}
