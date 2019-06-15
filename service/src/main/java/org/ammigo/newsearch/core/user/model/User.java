package org.ammigo.newsearch.core.user.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User 엔티티 정보 더 추가되어야 함
 */
@Getter
@Entity
public class User {
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;
}