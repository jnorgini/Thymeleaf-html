package com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
