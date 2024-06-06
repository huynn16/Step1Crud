package services;

import entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.categoryRepositories;

import java.util.List;

@Service
public class categoryService {
    @Autowired
    private categoryRepositories.CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
    public Category findByID(int id) {
        return categoryRepository.findById(id);
    }
    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }
}
