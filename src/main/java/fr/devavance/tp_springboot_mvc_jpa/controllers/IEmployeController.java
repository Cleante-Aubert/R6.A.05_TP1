package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface IEmployeController {

    public String displayHome(Model model);

    public String addEmployee(Employee employee);

    public String displayEmployee(Long id,  Model model);


}
