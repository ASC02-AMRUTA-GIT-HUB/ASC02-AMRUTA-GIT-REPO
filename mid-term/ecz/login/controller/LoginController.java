package com.ecz.login.controller;

import com.ecz.login.entity.LoginEntity;
import com.ecz.login.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    /** POST /api/login  (Body: { "loginId": "...", "password": "..." }) */
    @PostMapping
    public ResponseEntity<?> login(@RequestBody Map<String, String> body) {
        String loginId = body.get("loginId");
        String password = body.get("password");
        String msg = loginService.authenticate(loginId, password);

        return ResponseEntity.ok().body(Collections.singletonMap("message", msg));    }

    /** POST /api/login/register  (Body: LoginEntity JSON) — optional helper */
    @PostMapping("/register")
    public ResponseEntity<LoginEntity> register(@RequestBody LoginEntity entity) {
        return ResponseEntity.ok(loginService.register(entity));
    }
}
