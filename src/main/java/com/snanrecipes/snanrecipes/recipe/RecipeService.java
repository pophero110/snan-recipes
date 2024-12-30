package com.snanrecipes.snanrecipes.recipe;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public Mono<Recipe> createRecipe(RecipeInput recipeInput) {
        Recipe newRecipe = Recipe.builder()
                .title(recipeInput.title())
                .build();
        return recipeRepository.save(newRecipe);
    }

    public Mono<Recipe> updateRecipe(UUID id, RecipeInput recipeInput) {
        return recipeRepository.findById(id)
                .switchIfEmpty(Mono.error(new RuntimeException("Recipe not found")))
                .flatMap(recipe -> {
                    return recipeRepository.save(recipe.toBuilder().id(id).title(recipeInput.title()).build());
                });
    }

    public Mono<Void> deleteRecipe(UUID id) {
        return recipeRepository.findById(id)
                .switchIfEmpty(Mono.error(new RuntimeException("Recipe not found")))
                .flatMap(recipeRepository::delete);
    }

    public Flux<Recipe> getRecipes() {
        return recipeRepository.findAll();
    }
}
