package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OkController {
	@RequestMapping("/ok")
	public String ok() {
		return "ok/ok";
	}
	
	@PostMapping("/ctrl/ok")
	public String m1(Model model) {
		model.addAttribute("message", "Đây là M1");
		return "ok/ok";
	}
	
	@GetMapping("/ctrl/ok")
	public String m2(Model model) {
		model.addAttribute("message", "Đây là M2");
		return "ok/ok";
	}
	
	@GetMapping("/ctrl/ok/{x}")
	public String m3(@PathVariable("x") Integer x, Model model) {
		model.addAttribute("message", "M3(): x= " +x);
		return "ok/ok";
	}
}
