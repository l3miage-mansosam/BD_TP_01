package fr.uga.l3miage.tp1.exo3.models;

import lombok.Cleanup;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

public class ProductEntity {
    @Id
    @Column(name="bar_code_number", length = 15)
    private String barCodeNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "consumable")
    private Boolean consumable;

    @OneToMany(mappedBy = "product")
    private Set<BrandEntity> brands;
}