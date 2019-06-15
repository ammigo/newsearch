package org.ammigo.newsearch.core.category.model;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Size(min = 3, max = 20)
    @Column(nullable = false)
    private String item;

    @Column(name="user_seq")
    private Long userSeq;

}
