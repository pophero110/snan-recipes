package com.snanrecipes.snanrecipes.recipe;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class RecipeController {
    private final RecipeService recipeService;

    @MutationMapping(name = "addRecipe")
    public Mono<Recipe> addRecipe(@Argument(
            "recipe") RecipeInput recipeInput) {
        return recipeService.createRecipe(recipeInput);
    }

    @MutationMapping(name = "updateRecipe")
    public Mono<Recipe> updateRecipe(@Argument UUID id, @Argument("recipe") RecipeInput recipeInput) {
        return recipeService.updateRecipe(id, recipeInput);
    }

    @MutationMapping(name = "deleteRecipe")
    public Mono<Void> deleteRecipe(@Argument UUID id) {
        return recipeService.deleteRecipe(id);
    }

    @QueryMapping(name = "recipes")
    public Flux<Recipe> getRecipes() {
        return recipeService.getRecipes();
    }

}
