package com.snanrecipes.snanrecipes.recipe;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RecipeRepository extends ReactiveCrudRepository<Recipe, UUID> {
}
