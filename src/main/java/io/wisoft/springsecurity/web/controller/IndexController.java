package io.wisoft.springsecurity.web.controller;

import io.wisoft.springsecurity.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("posts",postsService.findAllDesc());
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
