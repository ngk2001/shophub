package com.shophub.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shophub.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    public List<Employee> findAllByUsername(String username);

	public Optional<Employee> findByUsername(String username);


}