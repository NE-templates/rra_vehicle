package com.trex.rra_vehicle.services.impl;

import com.trex.rra_vehicle.dtos.HistoryDTO;

import java.util.List;
import java.util.UUID;

public interface IHistoryImpl {

    HistoryDTO getHistory(UUID historyId);
    List<HistoryDTO> getVehicleHistory(String vehicleChassis);
    List<HistoryDTO> getAll();

}
