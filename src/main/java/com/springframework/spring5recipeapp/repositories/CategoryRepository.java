package com.springframework.spring5recipeapp.repositories;

import com.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

      Optional<Category> findByDescription(String description);
}
