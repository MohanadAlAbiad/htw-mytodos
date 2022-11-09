package de.webtech.mytodos.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HWContoller {

    @GetMapping(path ="/")
    public ModelAndView showHWPage() {
        return new ModelAndView("helloworld");

    }

}
