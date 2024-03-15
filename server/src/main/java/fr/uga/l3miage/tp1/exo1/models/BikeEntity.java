package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class BikeEntity {
    @Id
    private String immatriculation;

    //Before
    private Integer capacity;
    //After

    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber;

    private Boolean automatic;

    private Boolean shifter;

    @Enumerated(EnumType.STRING)
    private ShifterType shifterType;

    private LocalDate circulationDate;
}