package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/registerationForm")
	public String showRegisterationForm(Model theModel) {

		Employee employee = new Employee();

		theModel.addAttribute("employeeModel", employee);

		return "employee-form";
	}@RequestMapping("/processForm"){

	public String processForm(@ModelAttribute("employeeModel") Employee employee) {

		return "registeration-configuration";
	}

}