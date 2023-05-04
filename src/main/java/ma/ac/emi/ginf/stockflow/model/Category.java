package ma.ac.emi.ginf.stockflow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "category")
public class Category extends AbstractEntity{
    @Column(name="code")
    private String code;

    @Column(name="designation")
    private String designation;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;


}
