package com.codestates.praticegithubActionsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class control {

    @GetMapping("/")
    public String Hello () {
        return "helloeee";
    }
}
