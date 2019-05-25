package org.ammigo.newsearch.core.user.repository;

import org.ammigo.newsearch.core.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}