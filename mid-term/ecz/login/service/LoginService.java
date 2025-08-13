package com.ecz.login.service;

import com.ecz.exception.InvalidException;
import com.ecz.login.entity.LoginEntity;
import com.ecz.login.repository.LoginRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    /**
     * Very basic authentication as per requirements:
     * checks existence and plain-text equality of password.
     */
    public String authenticate(String loginId, String password) {
        LoginEntity user = loginRepository.findById(loginId)
                .orElseThrow(() -> new InvalidException("Invalid login id or password"));
        if (!user.getPassword().equals(password)) {
            throw new InvalidException("Invalid login id or password");
        }
        return "Login successful";
    }

    /** Helper for creating/moderator accounts (optional, for testing) */
    public LoginEntity register(LoginEntity entity) {
        if (entity.getLoginId() == null || entity.getLoginId().trim().isEmpty()) {
            throw new InvalidException("loginId cannot be empty");
        }
        if (entity.getPassword() == null || entity.getPassword().trim().isEmpty()) {
            throw new InvalidException("password cannot be empty");
        }
        return loginRepository.save(entity);
    }
}
