package com.springframework.spring5recipeapp.controller;

import com.springframework.spring5recipeapp.domain.SubcategoryCode;
import com.springframework.spring5recipeapp.services.SubcategoryCodeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class SubcategoryController {

    private final SubcategoryCodeService subcategoryCodeService;

    @GetMapping
    @RequestMapping("subcategory/{id}/category/{categoryId}/")
    public String searchById(@PathVariable String id, @PathVariable String categoryId){

      Optional<SubcategoryCode> subcategoryCode = subcategoryCodeService
              .resolveSubcategoryCode(id, categoryId);
      return subcategoryCode.get().getValue();
    }
}
