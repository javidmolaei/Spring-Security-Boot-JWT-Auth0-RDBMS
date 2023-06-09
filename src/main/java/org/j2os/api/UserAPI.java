package org.j2os.api;

import org.j2os.model.UserEntity;
import org.j2os.service.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Javid Molaei
 */

@RestController
@RequestMapping("/user")
public class UserAPI {
    private final UserService userService;

    public UserAPI(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public UserEntity get() {
        return userService.findByUsername(SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString());
    }
}
