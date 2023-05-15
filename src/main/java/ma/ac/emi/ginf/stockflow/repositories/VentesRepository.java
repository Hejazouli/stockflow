package ma.ac.emi.ginf.stockflow.repositories;


import ma.ac.emi.ginf.stockflow.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Ventes,Integer > {
}
