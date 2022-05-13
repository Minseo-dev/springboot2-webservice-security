package io.wisoft.springsecurity.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

//    private final HttpSession httpSession;
//
//    @GetMapping("/")
//    public String index(Model model){
//        model.addAttribute("posts", postsService.findAllDesc());
//
//        SessionUserDTO user = (SessionUserDTO) httpSession.getAttribute("user");
//
//        if(user != null){
//            model.addAttribute("userName", user.getName());
//        }
//        return "index";
//    }

}
