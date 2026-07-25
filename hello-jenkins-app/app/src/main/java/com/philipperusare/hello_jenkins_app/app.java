package com.philipperusare.hello_jenkins_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class app{

    @GetMapping("/")
    public String showHomePage(Model model) {
        // On passe le titre à la vue
        model.addAttribute("title", "I HAVE DEPLOY MY FIRST APP WITH JENKIN 😁😁");
        return "index";
    }
}