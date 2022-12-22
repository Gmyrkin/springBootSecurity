package ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByFirstName (String name);
}
