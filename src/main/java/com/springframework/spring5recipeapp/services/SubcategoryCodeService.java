package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.domain.SubcategoryCode;

import java.util.Optional;

public interface SubcategoryCodeService {
    Optional<SubcategoryCode> resolveSubcategoryCode(String subcategoryCode, String categoryCode);
}
