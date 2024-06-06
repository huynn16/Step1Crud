package repositories;
import entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class categoryRepositories {
    public interface CategoryRepository extends JpaRepository<Category, Integer> {
        default List<Category> findAll() {
            return null;
        }

        default Category save(Category category) {
            return null;
        }

        default Category findById(int id) {
            return null;
        }

        default void deleteById(int id) {

        }
    }
}


