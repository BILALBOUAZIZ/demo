package com.example.demo.employee;

import com.example.demo.exception.UserNotFoundException;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    /*public void addNewEmployee(@NotNull Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository
                .findEmployeeByEmail(employee.getEmail());
        if(employeeOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
      employeeRepository.save(employee);
    } */
    public Employee addEmployee(Employee employee){
        //employee.setId(Long.parseLong(UUID.randomUUID().toString()));
        return employeeRepository.save(employee);
    }
    public List<Employee> finAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id"+id+" was not found"));
    }
    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }
}