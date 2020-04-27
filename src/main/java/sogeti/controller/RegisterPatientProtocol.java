package sogeti.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterPatientProtocol {
	
	@GetMapping("/HealthCarePatientRegisterForm.html")
	public ModelAndView getPatientRegisterForm() {
		
		String viewName = "patientRegisterForm";
		
		Map<String, Object> model = new HashMap<String, Object>(); 
		
		model.put("prenom", "Florian");
		
		return new ModelAndView(viewName, model);
	}
	
}
