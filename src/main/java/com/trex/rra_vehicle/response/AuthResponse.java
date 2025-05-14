package com.trex.rra_vehicle.response;

import com.trex.rra_vehicle.dtos.UserDTO;
import com.trex.rra_vehicle.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthResponse {

    private String token;
    private UserDTO user;

}