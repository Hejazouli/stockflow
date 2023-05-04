package ma.ac.emi.ginf.stockflow.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idvente")
    private Ventes ventes;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;


}
