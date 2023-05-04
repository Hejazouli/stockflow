package ma.ac.emi.ginf.stockflow.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity{
    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name="photo")
    private String photo;

    @Column(name="mail")
    private String mail;

    @Column(name="numTelephone")
    private String numTel;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;


}
