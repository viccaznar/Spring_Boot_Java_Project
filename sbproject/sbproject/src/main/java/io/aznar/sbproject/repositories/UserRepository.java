package io.aznar.sbproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.aznar.sbproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
