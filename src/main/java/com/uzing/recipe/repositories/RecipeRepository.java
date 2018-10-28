package com.uzing.recipe.repositories;

import com.uzing.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Xinjie on 2018/10/26 10:31 PM.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
