package com.uzing.recipe.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Xinjie on 2018/10/26 9:29 PM.
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

}
