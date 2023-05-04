package ma.ac.emi.ginf.stockflow.exceptions;

public enum ErrorCodes {
    ARTICLE_NOT_FOUND(1000),
    ARTICLE_NOT_VALID(1001),
    CATEGOEY_NOT_FOUND(2000),
    COMMANDE_CLIENT_NOT_FOUND(4000),
    COMMANDE_FOURNISSEUR_NOT_FOUND(5000),
    CLIENT_NOT_FOUND(3000),
    FOURNISSEUR_NOT_FOUND(7000),
    ENTREPRISE_NOT_FOUND(6000),
    LIGNE_COMMANDE_CLIENT_NOT_FOUND(8000),
    LIGNE_COMMANDE_FOURNISSEUR_NOT_FOUND(9000),
    LIGNE_VENTE_NOT_FOUND(10000),
    UTILISATEUR_NOT_FOUND (12000),
    MVT_STK_NOT_FOUND(11000),
    VENTE_NOT_FOUND(13000),
    ;
    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
