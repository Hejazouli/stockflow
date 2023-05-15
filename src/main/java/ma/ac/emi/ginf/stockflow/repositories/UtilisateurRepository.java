package ma.ac.emi.ginf.stockflow.repositories;

import ma.ac.emi.ginf.stockflow.model.Category;
import ma.ac.emi.ginf.stockflow.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer > {
}
