package ma.ac.emi.ginf.stockflow.dto;


import lombok.Builder;
import lombok.Data;
import ma.ac.emi.ginf.stockflow.model.Article;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHT;

    private BigDecimal tauxTVA;

    private BigDecimal prixUnitaireTTC;

    private String photo;

    private CategoryDto category;

    public  ArticleDto fromEntity(Article article){
        if(article == null)
            return  null;
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHT(article.getPrixUnitaireHT())
                .tauxTVA(article.getTauxTVA())
                .prixUnitaireTTC(article.getPrixUnitaireTTC())
                .photo(article.getPhoto())
                .category(CategoryDto.fromEntity(article.getCategory()))
                .build();
    }
    public Article toEntity(ArticleDto articleDto){
        if(articleDto == null){
            return null;
        }
        Article article=new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixUnitaireHT(articleDto.getPrixUnitaireHT());
        article.setTauxTVA(articleDto.getTauxTVA());
        article.setPrixUnitaireTTC(articleDto.getPrixUnitaireTTC());
        article.setPhoto(articleDto.getPhoto());
        //article.setCategory(articleDto.getCategory());
        return  article;
    }
}
