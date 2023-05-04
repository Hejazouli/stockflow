package ma.ac.emi.ginf.stockflow.validator;

import ma.ac.emi.ginf.stockflow.dto.ArticleDto;
import ma.ac.emi.ginf.stockflow.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto articleDto){
        List<String> errors=new ArrayList<>();
        if(articleDto==null){
            errors.add("Veuillez renseigner le code de l'article");
            errors.add("Veuillez renseigner la designation de l'article");
            errors.add("Veuillez renseigner le prix unitaire de l'article");
            errors.add("Veuillez renseigner le taux tva de l'article");
            errors.add("Veuillez renseigner le taux tva de l'article");
            errors.add("Veuillez selectionner une categorie");


        }
        if(StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("Veuillez renseigner le code de l'article");
        }
        if(StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("Veuillez renseigner la designation de l'article");
        }
        if(articleDto.getPrixUnitaireHT()==null){
            errors.add("Veuillez renseigner le prix unitaire de l'article");
        }
        if(articleDto.getTauxTVA()==null){
            errors.add("Veuillez renseigner le taux tva de l'article");
        }
        if(articleDto.getPrixUnitaireTTC()==null){
            errors.add("Veuillez renseigner le prix unitaire l'article");
        }
        if(articleDto.getCategory()==null){
            errors.add("Veuillez selectionner une categorie");
        }
        return errors;
    }
}
