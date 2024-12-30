package com.snanrecipes.snanrecipes.recipe;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
public record RecipeInput(
        String title
) {
}
