package com.trex.rra_vehicle.services.impl;

import com.trex.rra_vehicle.dtos.UserDTO;
import com.trex.rra_vehicle.entities.User;
import com.trex.rra_vehicle.request.LoginRequest;
import com.trex.rra_vehicle.request.RegisterRequest;
import com.trex.rra_vehicle.response.AuthResponse;

public interface IAuthImpl {

    UserDTO registerUser(RegisterRequest registerRequest);
    AuthResponse login(LoginRequest loginRequest);
}
