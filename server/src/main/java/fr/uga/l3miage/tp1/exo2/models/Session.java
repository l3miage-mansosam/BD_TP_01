package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.UUID;


@Entity
@Table(name="Session")
public class Session {
    @Id
    private UUID idSession;
    private String lastCommand;
    private String currentDir;
    private Boolean lock;

    @OneToOne(mappedBy = "session")
    private User user;
}