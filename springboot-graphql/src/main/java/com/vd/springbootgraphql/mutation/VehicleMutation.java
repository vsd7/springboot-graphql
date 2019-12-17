/**
 * 
 */
package com.vd.springbootgraphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.vd.springbootgraphql.models.Vehicle;
import com.vd.springbootgraphql.service.VehicleService;

/**
 * @author vivedesh
 *
 */
@Component
public class VehicleMutation implements GraphQLMutationResolver{

	@Autowired
    private VehicleService vehicleService;
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
