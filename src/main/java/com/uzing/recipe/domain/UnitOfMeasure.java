package com.uzing.recipe.domain;

import javax.persistence.*;

/**
 * Created by Xinjie on 2018/10/26 9:29 PM.
 */
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Ingredient ingredient;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getUom() {
        return description;
    }

    public void setUom(String description) {
        this.description = description;
    }
}
