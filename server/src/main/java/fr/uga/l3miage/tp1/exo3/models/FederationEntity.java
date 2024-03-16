package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

public class FederationEntity {
    @Id
    private String name;

    private Boolean isFageMembership;

    @ManyToMany
    private Set<AssociationEntity> associationEntities;

}