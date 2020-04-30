package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.domain.SubcategoryCode;
import com.springframework.spring5recipeapp.repositories.SubCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SubcategoryCodeServiceImpl implements SubcategoryCodeService {

    private final SubCategoryRepository subCategoryRepository;

    @Override
    public Optional<SubcategoryCode> resolveSubcategoryCode(String subcategoryCode, String categoryCode) {

        return Optional.of(subCategoryRepository
                .findByValueIgnoreCaseAndCategoryCodeValueIgnoreCase(subcategoryCode, categoryCode));
    }
}
