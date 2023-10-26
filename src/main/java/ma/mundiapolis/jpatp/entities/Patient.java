package ma.mundiapolis.jpatp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOM",length = 50)
    private String nom;
    @Temporal(TemporalType.DATE) // par défaut c'est TIMESTAMP
    private Date dateNaissance;
    private boolean malade;
    private int score;

}
