package com.snanrecipes.snanrecipes.recipe;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Builder(toBuilder = true)
@Jacksonized
public record Recipe(
        @Id
        UUID id,
        String title
) {
}
