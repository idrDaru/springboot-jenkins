package com.example.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// @Controller
// class HtmlController {

//   @GetMapping("/")
//   fun blog(model: Model): String {
//     model["title"] = "Blog"
//     return "blog"
//   }

// }

@Controller
public class HtmlController {
  @GetMapping(value = { "/" })
  public String blog(Model model) {
    model.addAttribute("title", "Blog");
    return "blog";
  }
}