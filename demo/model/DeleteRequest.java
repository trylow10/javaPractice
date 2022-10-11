package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public record DeleteRequest(@JsonProperty("id") UUID id) implements Serializable {

    public DeleteRequest {
        Objects.requireNonNull(id, "id cannot be null");
    }
}
