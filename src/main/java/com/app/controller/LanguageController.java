package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LanguageController {

	@RequestMapping(value = "/listOfLang/{lang}", method = RequestMethod.GET)
	public String showLanguage(@PathVariable String lang, ModelMap model) {

		List<String> list = new ArrayList<String>();
		list.add("JSP");
		list.add("Android");
		list.add("Angular 4");
		list.add("NodeJS");
		list.add(lang);

		model.addAttribute("listOfLanguage", list);

		return "language-dev";
	}

	@GetMapping("/listOfLanguage/{lang}")
	public String getListOfLanguage(@PathVariable String lang, ModelMap model) {

		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("PHP");
		list.add("Python");
		list.add("C#");
		list.add("NodeJS");
		list.add(lang);

		model.addAttribute("listOfLanguage", list);

		return "language-dev";
	}

	@GetMapping("/sendRequest")
	public String sendRequest(HttpServletRequest request, ModelMap model) {
		String value = request.getParameter("value");
		List<String> list = new ArrayList<String>();
		list.add(value);

		model.addAttribute("listOfLanguage", list);
		return "language-dev";
	}

	@RequestMapping(value = "/addData", method = RequestMethod.GET)
	public ModelAndView addData() {
		ModelAndView mv = new ModelAndView("language-dev");

		List<String> list = new ArrayList<String>();
		list.add("Pob");
		list.add("Joe");
		mv.addObject("listOfLanguage", list);

		return mv;
	}
}
