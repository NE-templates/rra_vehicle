package com.trex.rra_vehicle.repositories;

import com.trex.rra_vehicle.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {

    Optional<Vehicle> findByChassisNumber(String chassisNumber);
    Optional<Vehicle> findByPlate_Number(String plateNumber);
    List<Vehicle> findByPlate_Owner_Id(UUID userId);
    boolean existsByChassisNumber(String chassisNumber);
    boolean existsByPlate_Number(String plateNumber);

}
