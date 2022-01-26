package com.example.demo.employee;

import com.example.demo.annonce.Annonce;
import com.example.demo.conge.CongeDemande;
import com.example.demo.conge.CongeState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK) ;

    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK) ;

    }
    /*
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

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.CREATED) ;
    }
    */

    //conge_request
    @GetMapping("/conge/demande")
    public ResponseEntity<List<CongeDemande>> getConge(){
    List<CongeDemande> conges = employeeService.findConge();
    return new ResponseEntity<>(conges, HttpStatus.OK) ;
    }
    @GetMapping("/conge/state")
    public ResponseEntity<List<CongeState>> getCongeState(){
        List<CongeState> congeStates = employeeService.findCongeState();
        return new ResponseEntity<>(congeStates, HttpStatus.OK) ;
    }
    @PostMapping("conge/ask")
    public  ResponseEntity<CongeDemande> AddCongeDemande(@RequestBody CongeDemande congeDemande){
        CongeDemande newCongeDemande =  employeeService.addCongeDemande(congeDemande);
        return new ResponseEntity<>(newCongeDemande, HttpStatus.CREATED) ;
    }

    @PutMapping("conge/demande/update")
    public  ResponseEntity<CongeDemande> UpdateCongeDemande(@RequestBody CongeDemande congeDemande){
        CongeDemande newCongeDemande =  employeeService.updateCongeDemande(congeDemande);
        return new ResponseEntity<>(newCongeDemande, HttpStatus.CREATED) ;
    }
    @DeleteMapping("conge/demande/delete/{id}")
    public  ResponseEntity<CongeDemande> DeleteCongeDemande(@PathVariable("id") Long id){
        employeeService.deleteCongeDemande(id);
        return new ResponseEntity<>(HttpStatus.OK) ;
    }

    //annonces

    @GetMapping("/annonce/all")
    public ResponseEntity<List<Annonce>> getAnnonce() {
        List<Annonce> annonces = employeeService.findAnnonce();
        return new ResponseEntity<>(annonces, HttpStatus.OK);
    }
    @GetMapping("/annonce/{id}")
    public ResponseEntity<List<Annonce>> getAnnonceById(@PathVariable("id") Long id) {
        List<Annonce> annonces = employeeService.findAnnonceById(id);
        return new ResponseEntity<>(annonces, HttpStatus.OK);
    }

}
