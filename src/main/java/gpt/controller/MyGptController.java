package gpt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first_gpt")
public class MyGptController {

    @GetMapping("/gpt_test")
    public String GetGPTContent(String[] args) {
        return "";
    }

}
