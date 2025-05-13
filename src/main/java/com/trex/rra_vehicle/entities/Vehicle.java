package com.trex.rra_vehicle.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "vehicles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String chassisNumber;

    @Column(nullable = false)
    private String manufacturer;

    @Column(length = 5, nullable = false)
    private Integer manufacturedYear;

    @Column(nullable = false)
    private Integer price;

    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @OneToOne(optional = false)
    @JoinColumn(name = "plate_id", unique = true, nullable = false)
    private PlateNumber plateNumber;

}
