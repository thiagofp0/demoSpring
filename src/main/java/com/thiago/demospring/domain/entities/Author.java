package com.thiago.demospring.domain.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
