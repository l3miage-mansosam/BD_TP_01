package fr.uga.l3miage.tp1.exo3.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import java.util.Set;
@Entity
public class AssociationEntity {
    @Id
    private String name;
    @Column(updatable = false, nullable = false)
    private String presidentName;
    @Column(updatable = false, nullable = false)
    private String treasurerName;
    private String secretaryName;
    @Enumerated(EnumType.STRING)
    private AssociationType associationEntity;

    @ManyToOne
    private FederationEntity federationEntitie;
}