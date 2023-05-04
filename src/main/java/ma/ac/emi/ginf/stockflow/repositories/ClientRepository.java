package ma.ac.emi.ginf.stockflow.repositories;

import ma.ac.emi.ginf.stockflow.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Integer, Client> {
}
