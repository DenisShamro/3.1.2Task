package ds.PP3_1_2SS.controllers;

import ds.PP3_1_2SS.services.CustomUserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final CustomUserDetailsService userService;

    public UserController(CustomUserDetailsService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String user( Model model) {
        model.addAttribute("user", userService.getCurrentUserFromContext());
        return "UserPage";
    }
}
