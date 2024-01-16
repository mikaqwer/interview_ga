package ru.greenatom.iam.interview.service;

import ru.greenatom.iam.interview.entity.Role;

import java.util.List;

public interface UserService {

    boolean logon(String login, String password);

    boolean addRole(String userId, List<String> roleNames);
}
