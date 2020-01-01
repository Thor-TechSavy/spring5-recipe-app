//package com.springframework.spring5recipeapp.services.impl;
//
//import com.springframework.spring5recipeapp.domain.Recipe;
//import com.springframework.spring5recipeapp.repositories.RecipeRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.HashSet;
//import java.util.Optional;
//import java.util.Set;
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
//
//public class RecipeServiceImplTest {
//
//    RecipeServiceImpl recipeService;
//
//    @Mock
//    RecipeRepository recipeRepository;
//
//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//        recipeService = new RecipeServiceImpl(recipeRepository, recipeCommandToRecipe, recipeToRecipeCommand);
//    }
//
//    @Test
//    public void getRecipesByIdTest() throws Exception{
//        Recipe recipe = new Recipe();
//        recipe.setId(1L);
//        Optional<Recipe> recipeOptional = Optional.of(recipe);
//        when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);
//        Recipe returnedRecipe = recipeService.findById(1L);
//        assertNotNull("Null Recipe Returned", returnedRecipe);
//        verify(recipeRepository,times(1)).findById(1L);
//        verify(recipeRepository,never()).findAll();
//    }
//
//    @Test
//    public void getRecipesTest() {
//        Recipe recipe = new Recipe();
//        HashSet<Recipe> recipes = new HashSet<>();
//        recipes.add(recipe);
//        when(recipeRepository.findAll()).thenReturn(recipes);
//        Set<Recipe> recipeSet = recipeService.getRecipes();
//        assertEquals(recipeSet.size(), 1);
//        verify(recipeRepository, times(1)).findAll();
//        verify(recipeRepository, never()).findById(anyLong());
//
//    }
//}