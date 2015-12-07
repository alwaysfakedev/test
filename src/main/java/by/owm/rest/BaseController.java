package by.owm.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by haria on 12/1/2015.
 */
@Controller
public class BaseController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String start()
    {
        return "redirect:/app";
    }

}
