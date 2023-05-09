package ru.duxa.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.duxa.buysell.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
