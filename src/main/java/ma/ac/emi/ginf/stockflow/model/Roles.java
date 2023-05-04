package ma.ac.emi.ginf.stockflow.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Roles extends AbstractEntity{
    @Column(name = "rolename")
    private  String roleName;
    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;
}
