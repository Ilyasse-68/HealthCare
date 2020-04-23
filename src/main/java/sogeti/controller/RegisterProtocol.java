package sogeti.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import sogeti.model.User;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisterProtocol {

    @GetMapping("/register")
    public ModelAndView getRegisterForm() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("User", new User());
        return new ModelAndView("register", model);
    }
    @PostMapping("/register")
    public ModelAndView submitRegistration(User user) {
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getSurname());
        System.out.println(user.getMail());
        System.out.println(user.getPassword());

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/");
        return new ModelAndView(redirectView);
    }
}
