package ubc.cpsc304.group20.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

    @GetMapping("/test")
    public ModelAndView test() {
        




        return null;
    }

    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}
