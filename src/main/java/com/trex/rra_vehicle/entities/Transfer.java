package com.trex.rra_vehicle.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transfers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne(optional = false)
    @JoinColumn(name = "previous_owner_id", nullable = false)
    private User previousOwner;

    @ManyToOne(optional = false)
    @JoinColumn(name = "new_owner_id", nullable = false)
    private User newOwner;

    @Column(nullable = false)
    private Integer purchasePrice;

    @Column(nullable = false)
    private LocalDateTime transferDate;

}
