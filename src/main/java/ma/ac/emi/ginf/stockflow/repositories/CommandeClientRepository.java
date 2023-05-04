package ma.ac.emi.ginf.stockflow.repositories;

import ma.ac.emi.ginf.stockflow.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
