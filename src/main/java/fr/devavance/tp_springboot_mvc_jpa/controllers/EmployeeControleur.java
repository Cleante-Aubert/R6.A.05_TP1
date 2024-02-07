package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControleur {

    private IEmployeeDAO employeeDAO;
    @Autowired
    public EmployeeControleur(IEmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/employee")
    public Employee show_all_employees(Model model){
        model.addAttribute("Employees",employeeDAO.findAll());
        return ;

    }



}
