package com.mestaoui.dataretrievemicroservice.repositories;

import com.mestaoui.dataretrievemicroservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee getEmployeeByFullName(String fullName);

    List<Employee> getEmployeesByCompanyName(String companyName);
}
