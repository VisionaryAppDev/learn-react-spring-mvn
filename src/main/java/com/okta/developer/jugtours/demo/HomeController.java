package com.okta.developer.jugtours.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @Autowired
    EmployeeRepository repository;

	@RequestMapping(value = "/")
	public String index() {
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
		return "index";
    }

    @ResponseBody
    @GetMapping(value="/a")
    public Object getEmpl() {
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        return repository.findAll();
    }


    @ResponseBody
    @GetMapping(value="/b")
    public Object getEmp2l() {
		return (new Employee("Frodo", "Baggins", "ring bearer"));
    }



}