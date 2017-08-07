package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Person;

@Controller
public class EmpoloyeeController {
	@GetMapping("/showEmpForm")
	public String getEmpForm() {
		return "emp-from";
	}

	@RequestMapping(value = { "/saveEmployee" }, method = RequestMethod.POST)
	public ModelAndView saveEmployee(HttpServletRequest request, ModelMap model) {
		String empId = request.getParameter("empId");
		String empName = request.getParameter("empName");
		String empAddress = request.getParameter("empAddress");

		ModelAndView mv = new ModelAndView();

		if (empId.isEmpty() || empName.isEmpty() || empAddress.isEmpty()) {
			model.addAttribute("error", "Please input all field!");
			mv.setViewName("emp-from");

		} else {
			mv.setViewName("emp-detail");
		}

		List<String> list = new ArrayList<String>();
		list.add(empId);
		list.add(empName);
		list.add(empAddress);
		model.addAttribute("empList", list);

		return mv;
	}

	@GetMapping("/showPersonForm")
	public String getPersonForm() {
		return "person-from";
	}

	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public ModelAndView submitPerson(@ModelAttribute("personForm") Person person, ModelMap model) {
		ModelAndView mv = new ModelAndView();

		if (person.getId().isEmpty() || person.getFirstname().isEmpty() || person.getLastname().isEmpty()
				|| person.getAge().isEmpty()) {
			model.addAttribute("error", "Please input all field!");
			mv.setViewName("person-from");

		} else {
			mv.setViewName("person-detail");
		}

		List<Person> list = new ArrayList<Person>();
		list.add(person);
		model.addAttribute("personList", list);
		return mv;
	}
}
