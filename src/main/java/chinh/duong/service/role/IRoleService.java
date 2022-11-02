package chinh.duong.service.role;

import chinh.duong.model.Role;
import chinh.duong.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName roleName);
}
