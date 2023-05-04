package ma.ac.emi.ginf.stockflow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{
    @Column(name = "codearticle")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name="prixunitaireht")
    private BigDecimal prixUnitaireHT;

    @Column(name="tauxtva")
    private BigDecimal tauxTVA;

    @Column(name="prixunitairettc")
    private BigDecimal prixUnitaireTTC;

    private String photo;
    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;




}
