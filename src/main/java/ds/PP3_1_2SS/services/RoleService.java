package ds.PP3_1_2SS.services;

import ds.PP3_1_2SS.models.Role;
import ds.PP3_1_2SS.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Optional<Role> findByName(String name) {
        return roleRepository.findByRoleName(name);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public List<Role> getRolesByIds(List<Integer> id) {
        return roleRepository.findAllById(id);
    }
    @Transactional
    public void save(Role role) {
         roleRepository.save(role);
    }
}

