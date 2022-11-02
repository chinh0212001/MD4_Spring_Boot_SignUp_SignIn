package chinh.duong.repository;

import chinh.duong.model.Role;
import chinh.duong.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role,Long> {

  Optional<Role>findByName(RoleName roleName);
}
