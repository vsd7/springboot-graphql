/**
 * 
 */
package com.vd.springbootgraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vd.springbootgraphql.models.Vehicle;

/**
 * @author vivedesh
 *
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
