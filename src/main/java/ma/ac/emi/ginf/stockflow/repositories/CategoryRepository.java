package ma.ac.emi.ginf.stockflow.repositories;

import ma.ac.emi.ginf.stockflow.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Integer, Category> {
}
