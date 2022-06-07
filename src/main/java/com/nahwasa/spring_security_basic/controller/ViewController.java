package com.nahwasa.spring_security_basic.controller;

import com.nahwasa.spring_security_basic.config.UserInfo;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/view")
public class ViewController {
    @GetMapping("/login")
    public String viewLoginPage() {
        return "login";
    }

    @GetMapping("/loginSuccess")
    public String viewLoginSuccessPage(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("userId", user.getUsername());
        model.addAttribute("userRoles", user.getAuthorities());
        return "loginSuccess";
    }
}
