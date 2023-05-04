package ma.ac.emi.ginf.stockflow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity{
    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name="codefiscal")
    private String codeFiscal;

    @Column(name="photo")
    private String photo;

    @Column(name="email")
    private String mail;

    @Column(name="numTelephone")
    private String numTel;

    @Column(name="siteweb")
    private String siteWeb;

    @OneToMany(mappedBy="entreprise")
    private List<Utilisateur> utilisateurs;
}
