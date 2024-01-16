package ru.greenatom.iam.interview.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("auth")
public interface InterviewController {

    // передать логин пароль
    @PostMapping("logon")
    ResponseEntity<Void> logon();

    // пример вызова localhost:8877/auth/add-role/{userId}?rolesName=first&rolesName=second
    @PostMapping("add-role/{userId}")
    ResponseEntity<Void> addRole(String userId, List<String> rolesName);
}
