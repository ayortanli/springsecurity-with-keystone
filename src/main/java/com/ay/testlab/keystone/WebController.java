package com.ay.testlab.keystone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class WebController {

    @GetMapping("/private")
    public String privateAccess(HttpServletRequest request) {
        return "this is private page for user: "+request.getUserPrincipal().getName();
    }

    @GetMapping("/public")
    public String publicAccess() {
        return "this is public page";
    }
}
