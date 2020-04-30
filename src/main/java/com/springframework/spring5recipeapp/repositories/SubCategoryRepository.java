package com.springframework.spring5recipeapp.repositories;

import com.springframework.spring5recipeapp.domain.SubcategoryCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubcategoryCode, Long> {

    SubcategoryCode findByValueIgnoreCaseAndCategoryCodeValueIgnoreCase(String subcategoryCode,
                                                                        String categoryCode);
}
