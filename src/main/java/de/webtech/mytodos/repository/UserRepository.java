package de.webtech.mytodos.repository;

import de.webtech.mytodos.entity.Todo;
import de.webtech.mytodos.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
}
