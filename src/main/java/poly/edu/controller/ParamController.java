package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
	@RequestMapping("/param/form")
	public String form() {
		return "view/form";
	}

	@PostMapping("/param/save/{x}")
	public String save(@PathVariable("x") String x, 
						@RequestParam("y") String y, 
						Model model) {
		model.addAttribute("x", x);
		model.addAttribute("y", y);
		return "view/form";
	}
}
