package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControleur {
    @Autowired
    private IEmployeeDAO employeeDAO;



    @RequestMapping("/employees")
    public String findAllEmployee(Model model) {
        model.addAttribute("employees", employeeDAO.findAll());
        model.addAttribute("employee", new Employee());
        return "views_employee";
    }
/*
    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee){

        return "redirect:/";
    }
*/
}

