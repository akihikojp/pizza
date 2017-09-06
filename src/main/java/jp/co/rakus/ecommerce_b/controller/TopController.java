package jp.co.rakus.ecommerce_b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.ecommerce_b.service.TopService;

@Controller
@RequestMapping("/top")
public class TopController {
	@Autowired
	private TopService topService;
	
	@RequestMapping("/")
	public String showTopPage(Model model) {
		model.addAttribute("itemList", topService.findAll());
		return "";
	}
}
