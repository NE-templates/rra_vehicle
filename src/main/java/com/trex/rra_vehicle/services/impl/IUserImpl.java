package com.trex.rra_vehicle.services.impl;

import com.trex.rra_vehicle.dtos.UserDTO;
import com.trex.rra_vehicle.request.UpdateUserRequest;

import java.util.List;
import java.util.UUID;

public interface IUserImpl {

    UserDTO getUser(UUID userId);
    UserDTO updateUser(UUID userId, UpdateUserRequest updateUserRequest);
    void deleteUser(UUID userId);

    List<UserDTO> getAllUsers();

}
