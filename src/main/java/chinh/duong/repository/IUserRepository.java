package chinh.duong.repository;

import chinh.duong.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User,Long> {
    Boolean existsByUsername(String user);
    Boolean existsByEmail(String email);
    Optional<User> findByUsername(String username);
}
