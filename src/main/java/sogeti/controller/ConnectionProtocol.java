package sogeti.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sogeti.model.Doctor;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ConnectionProtocol {

    @GetMapping("/login")
    public ModelAndView getRegisterForm() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("Doctor", new Doctor());
        return new ModelAndView("login", model);
    }
}
