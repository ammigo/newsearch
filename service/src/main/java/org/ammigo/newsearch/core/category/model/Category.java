package org.ammigo.newsearch.core.category.model;

import lombok.Getter;
import org.ammigo.newsearch.core.user.model.User;

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

    @ManyToOne
    @JoinColumn
    private User user;

}
