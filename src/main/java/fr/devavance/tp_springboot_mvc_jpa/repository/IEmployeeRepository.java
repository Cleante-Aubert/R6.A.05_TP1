package fr.devavance.tp_springboot_mvc_jpa.repository;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
