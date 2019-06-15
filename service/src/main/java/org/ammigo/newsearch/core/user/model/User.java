package org.ammigo.newsearch.core.user.model;

import lombok.Getter;
import org.ammigo.newsearch.core.category.model.Category;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * User 엔티티 정보 더 추가되어야 함
 */
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Size(min = 3, max = 20)
    @Column(nullable = false, name = "user_id")
    private String userId;

    @Size(min = 3, max = 20)
    @Column(nullable = false)
    private String password;

    @Size(min = 3, max = 20)
    @Column(nullable = false)
    private String name;

    @Size(max = 50)
    @Column(nullable = false)
    private String email;

    @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="user_seq")
    private List<Category> categories;

}