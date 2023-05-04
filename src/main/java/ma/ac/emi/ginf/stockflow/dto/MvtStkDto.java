package ma.ac.emi.ginf.stockflow.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import ma.ac.emi.ginf.stockflow.model.Article;
import ma.ac.emi.ginf.stockflow.model.TypeMvtStk;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStk typeMvt;
}
