package ru.greenatom.iam.interview.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.greenatom.iam.interview.entity.Role;

public interface RoleRepository  extends JpaRepository<Role, String> {
}
