package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeDAO;
import fr.devavance.tp_springboot_mvc_jpa.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeControleur {

    private final IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeControleur(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        System.out.println(employeeRepository.findAll());
    }

    @GetMapping("/view_employees")
    public String findAllEmployee(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());

        return "views_employee";
    }
    @GetMapping("/")
    public String showEmployeeNames(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeeRepository.findAll());
        return "views_employee";
    }


    @PostMapping("/addemployee")
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/";
    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employees";
    }
}
