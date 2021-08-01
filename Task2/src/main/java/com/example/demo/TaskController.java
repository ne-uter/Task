package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {

	@Autowired
	CatRepository catRepository;
	
	@RequestMapping(value="/")
    public String index(Model model) {
		java.util.List<Entity> list =catRepository.catSelect();
		model.addAttribute("entity", list);
        return "view";
	}
	
}
