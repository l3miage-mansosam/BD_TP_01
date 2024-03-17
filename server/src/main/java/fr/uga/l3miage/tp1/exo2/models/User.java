package fr.uga.l3miage.tp1.exo2.models;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name="User")
public class User {
    @Id
    private Long idUser;
    private Boolean SSO;
    private OffsetDateTime lastConnexion;
    @OneToOne
    private Session session;
}