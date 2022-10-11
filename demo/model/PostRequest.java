package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public record PostRequest(@JsonProperty("name") String name,
                          @JsonProperty("age") Integer age) implements Serializable {

    public PostRequest {
        Objects.requireNonNull(name, "name cannot be null");
        Objects.requireNonNull(age, "age cannot be null");
    }
}
