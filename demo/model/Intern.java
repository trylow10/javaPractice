package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record Intern(@JsonProperty("id") UUID id,
                     @JsonProperty("name") String name,
                     @JsonProperty("age") Integer age) implements Serializable {

    public Intern {
        Objects.requireNonNull(id, "id cannot be null");
        Objects.requireNonNull(name, "name cannot be null");
        Objects.requireNonNull(age, "age cannot be null");
    }
}
