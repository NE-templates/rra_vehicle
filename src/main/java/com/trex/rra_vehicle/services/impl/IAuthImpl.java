package com.trex.rra_vehicle.services.impl;

import com.trex.rra_vehicle.entities.User;
import com.trex.rra_vehicle.request.RegisterRequest;

public interface IAuthImpl {

    User registerUser(RegisterRequest registerRequest);

}
