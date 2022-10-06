package bcu.bcu_project1_22_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/convert")
    public String convert() {
        return "convert";
    }

    @GetMapping("/mypage")
    public String mypage() {
        return "mypage";
    }

    @GetMapping("/rank")
    public String rank() {
        return "rank";
    }

    @GetMapping("/write")
    public String write() {
        return "write";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/join")
    public String join() {
        return "join";
    }

}
