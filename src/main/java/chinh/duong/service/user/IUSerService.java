package chinh.duong.service.user;

import chinh.duong.model.User;

import java.util.Optional;

public interface IUSerService {
    Boolean existsByUsername(String user);
    Boolean existsByEmail(String email);
    void save(User user);
    Optional<User> findByUsername(String username);
}
