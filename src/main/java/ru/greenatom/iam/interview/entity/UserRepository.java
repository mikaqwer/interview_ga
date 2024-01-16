package ru.greenatom.iam.interview.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.greenatom.iam.interview.entity.Role;
import ru.greenatom.iam.interview.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
}
