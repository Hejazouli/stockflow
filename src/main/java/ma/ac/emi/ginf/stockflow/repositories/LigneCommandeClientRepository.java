package ma.ac.emi.ginf.stockflow.repositories;

import ma.ac.emi.ginf.stockflow.model.Category;
import ma.ac.emi.ginf.stockflow.model.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeClientRepository extends JpaRepository<Integer, LigneCommandeClient> {
}
