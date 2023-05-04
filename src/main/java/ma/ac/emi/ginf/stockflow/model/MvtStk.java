package ma.ac.emi.ginf.stockflow.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mouvementdestock")
public class MvtStk extends AbstractEntity{

    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name ="quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @Column(name ="typemvt")
    private TypeMvtStk typeMvt;

}
