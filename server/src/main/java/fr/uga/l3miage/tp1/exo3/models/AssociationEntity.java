package fr.uga.l3miage.tp1.exo3.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.Set;

public class AssociationEntity {
    @Id
    private String name;
    @Column(updatable = false, nullable = false)
    private String presidentName;
    @Column(updatable = false, nullable = false)
    private String treasurerName;
    private String secretaryName;
    @Enumerated(EnumType.STRING)
    private AssociationEntity associationEntity;

    @ManyToMany(mappedBy = "assocationEntities")
    private Set<FederationEntity> federationEntities;
}