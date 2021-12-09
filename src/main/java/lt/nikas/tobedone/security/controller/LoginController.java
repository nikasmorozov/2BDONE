package lt.nikas.tobedone.security.controller;

import lt.nikas.tobedone.Endpoint;
import lt.nikas.tobedone.security.dto.LoginResponse;
import lt.nikas.tobedone.security.jpa.entity.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public LoginResponse login(@AuthenticationPrincipal User user) {
        return new LoginResponse(user);
    }
}
