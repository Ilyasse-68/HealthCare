package controller;

import model.User;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisterProtocol {

    @GetMapping("/register")
    public ModelAndView getRegisterForm() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("test", "1234");
        return new ModelAndView("register", model);
    }
}
