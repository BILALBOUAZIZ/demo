package com.example.demo.rh;

import com.example.demo.annonce.Annonce;
import com.example.demo.conge.CongeDemande;
import com.example.demo.conge.CongeState;
import com.example.demo.employee.Employee;
import com.example.demo.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/rh")
public class RhController {
    private final RhService rhService;
    private final EmployeeService employeeService;

    @Autowired
    public RhController(RhService rhService, EmployeeService employeeService) {
        this.rhService = rhService;
        this.employeeService = employeeService;
    }

    @GetMapping("/rhres/all")
    public ResponseEntity<List<RhRes>> getRhRes() {
        List<RhRes> rhres = rhService.findAllRhRes();
        return new ResponseEntity<>(rhres, HttpStatus.OK);
    }
    @GetMapping("/rhres/find/{id}")
    public ResponseEntity<RhRes> getRhResById(@PathVariable("id") Long id) {
        RhRes rhres = rhService.findRhResById(id);
        return new ResponseEntity<>(rhres, HttpStatus.OK);
    }

    @PostMapping("/rhres/add")
    public  ResponseEntity<RhRes> AddRhRes(@RequestBody RhRes rhRes){
        RhRes newRhRes =  rhService.addRhRes(rhRes);
        return new ResponseEntity<>(newRhRes, HttpStatus.CREATED) ;
    }
    @PutMapping("/rhres/update")
    public  ResponseEntity<RhRes> updateRhRes(@RequestBody RhRes rhRes){
        RhRes updateRhRes =  rhService.updateRhRes(rhRes);
        return new ResponseEntity<>(updateRhRes, HttpStatus.OK) ;
    }
    @DeleteMapping("/rhres/delete/{id}")
    public  ResponseEntity<?> deleteRhRes(@PathVariable("id") Long id){
        rhService.deleteRhRes(id);
        return new ResponseEntity<>(HttpStatus.CREATED) ;

    }

    //employee

    @GetMapping("employee/all")
    public ResponseEntity<List<Employee>> getEmployee(){
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK) ;

    }
    @GetMapping("employee/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK) ;

    }

    @PostMapping("employee/add")
    public  ResponseEntity<Employee> AddEmployee(@RequestBody Employee employee){
        Employee newEmployee =  employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED) ;
    }

    @PutMapping("employee/update")
    public  ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee updateEmployee =  employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK) ;
    }

    @DeleteMapping("employee/delete/{id}")
    public  ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.CREATED) ;
    }

    //conge_attribue

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
    @PostMapping("conge/responde")
    public  ResponseEntity<CongeState> AddCongeState(@RequestBody CongeState congeState){
        CongeState newCongeState =  rhService.addCongeState(congeState);
        return new ResponseEntity<>(newCongeState, HttpStatus.CREATED) ;
    }

    @PutMapping("conge/responde/update")
    public  ResponseEntity<CongeState> UpdateCongeState(@RequestBody CongeState congeState){
        CongeState newCongeState =  rhService.updateCongeState(congeState);
        return new ResponseEntity<>(newCongeState, HttpStatus.CREATED) ;
    }
    @DeleteMapping("conge/responde/delete/{id}")
    public  ResponseEntity<CongeState> DeleteCongeState(@PathVariable("id") Long id){
        rhService.deleteCongeState(id);
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

    @PostMapping("annonce/add")
    public  ResponseEntity<Annonce> AddAnnonce(@RequestBody Annonce annonce){
        Annonce newAnnonce =  rhService.addAnnonce(annonce);
        return new ResponseEntity<>(newAnnonce, HttpStatus.CREATED) ;
    }
    @PutMapping("annonce/update")
    public  ResponseEntity<Annonce> UpdateAnnonce(@RequestBody Annonce annonce){
        Annonce newAnnonce =  rhService.updateAnnonce(annonce);
        return new ResponseEntity<>(newAnnonce, HttpStatus.CREATED) ;
    }
    @DeleteMapping("annonce/delete/{id}")
    public  ResponseEntity<Annonce> DeleteAnnonce(@PathVariable("id") Long id){
        rhService.deleteAnnonce(id);
        return new ResponseEntity<>(HttpStatus.OK) ;
    }

}
