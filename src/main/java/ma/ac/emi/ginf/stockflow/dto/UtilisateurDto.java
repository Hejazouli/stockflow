package ma.ac.emi.ginf.stockflow.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private Instant dateDeNaissance;

    private String motDePasse;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;
}
