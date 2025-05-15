package com.trex.rra_vehicle.repositories;

import com.trex.rra_vehicle.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, UUID> {

    List<Transfer> findAllByVehicle_ChassisNumber(String chassisNumber);

}
