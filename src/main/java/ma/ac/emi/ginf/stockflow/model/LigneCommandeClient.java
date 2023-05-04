package ma.ac.emi.ginf.stockflow.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lignecommandeclient")
public class LigneCommandeClient extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "idcommandeclient")
    private CommandeClient commandeClient;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;


}
