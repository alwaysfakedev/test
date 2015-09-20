package by.owm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by HaRiA on 30.07.2014.
 */
@Controller
@RequestMapping("")
public class ProjectController {

    @RequestMapping("/")
    public ModelAndView start(HttpServletRequest request,
                              HttpServletResponse response) {
        return new ModelAndView("index");
    }
}
