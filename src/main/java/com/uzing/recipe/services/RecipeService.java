package com.uzing.recipe.services;

import com.uzing.recipe.domain.Recipe;

import java.util.Set;

/**
 * Created by Xinjie on 2018/10/27 4:36 PM.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
