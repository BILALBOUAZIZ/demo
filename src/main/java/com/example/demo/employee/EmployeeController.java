package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getEmployee(){
        List<Employee> employees = employeeService.finAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK) ;

    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK) ;

    }
    @PostMapping("/add")
    public  ResponseEntity<Employee> AddEmployee(@RequestBody Employee employee){
       Employee newEmployee =  employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED) ;
    }
    @PutMapping("/update")
    public  ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee updateEmployee =  employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK) ;
    }
    /*
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.CREATED) ;
    }
    */
}
