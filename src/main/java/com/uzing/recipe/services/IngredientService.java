package com.uzing.recipe.services;

import com.uzing.recipe.commands.IngredientCommand;

/**
 * Created by Xinjie on 2018/11/1 2:54 PM.
 */
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    public void deleteById(Long recipeId, Long idToDelete);
}
