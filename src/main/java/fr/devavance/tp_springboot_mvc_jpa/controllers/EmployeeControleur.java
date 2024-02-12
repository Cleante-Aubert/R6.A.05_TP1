package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class EmployeeControleur implements IEmployeController {

    private final IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeControleur(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        System.out.println(employeeRepository.findAll());
    }


    @GetMapping("/view_employees")
    public String findAllEmployee(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "view_home";
    }

    @GetMapping("/employee/home")
    public String displayHome(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeeRepository.findAll());
        return "view_home";
    }

    @Override
    public String displayHome(ch.qos.logback.core.model.Model model) {
        return null;
    }

    @PostMapping("/employee/addemployee")
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/employee/home";
    }

    @Override
    public String displayEmployee(Long id, ch.qos.logback.core.model.Model model) {
        return null;
    }


    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employees";
    }


    @RequestMapping(value = "/employee/{id}")
    public String displayEmployee(@PathVariable(name="id") Long id, Model model) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee employee = optionalEmployee.get();
        model.addAttribute("employee", employee);
        return "view_employee";
    }

}
