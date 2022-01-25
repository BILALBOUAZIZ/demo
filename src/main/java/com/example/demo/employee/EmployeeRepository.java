package com.example.demo.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee,Long> {
// selelect employee where email= ...
    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> findEmployeeByEmail(String email);

    void deleteEmployeeById(Long id);

   Optional <Employee> findEmployeeById(Long id);
}
