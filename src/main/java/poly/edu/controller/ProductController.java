package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import poly.edu.Product;

@Controller
public class ProductController {
	@GetMapping("/product/form")
	public String form(Model model) {
		model.addAttribute("product", new Product());
		return "product/form";
	}

	@PostMapping("/product/save")
	public String save(@ModelAttribute Product product, Model model) {
		model.addAttribute("product", product);
		return "product/form";
	}
}
