package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MCController {

	@Autowired
	MouseRepository mouseRepository;
	
	@ModelAttribute
	MouseEntity entity() {
		return new MouseEntity();
	}
	
	//アクセスすると一覧表示
	@RequestMapping("/")
	public String index(Model model) {
		List<MouseEntity> list = mouseRepository.selectMouse();
		model.addAttribute("mouse", list);
		return "view";
	}
	
	//データ登録
	@PostMapping(value = "/")
	public String postIndex(@ModelAttribute MouseEntity entity, Model model) {
		mouseRepository.insertMouse(entity);
		 return "view";
		
	}
}
