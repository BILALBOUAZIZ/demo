package com.example.demo.employee;

import com.example.demo.annonce.Annonce;
import com.example.demo.annonce.AnnonceRepository;
import com.example.demo.conge.CongeDemande;
import com.example.demo.conge.CongeRepository;
import com.example.demo.conge.CongeState;
import com.example.demo.conge.CongeStateRepository;
import com.example.demo.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final CongeRepository congeRepository;
    private final CongeStateRepository congeStateRepository;
    private final AnnonceRepository annonceRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, CongeRepository congeRepository, CongeStateRepository congeStateRepository, AnnonceRepository annonceRepository) {
        this.employeeRepository = employeeRepository;
        this.congeRepository = congeRepository;
        this.congeStateRepository = congeStateRepository;
        this.annonceRepository = annonceRepository;
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
    public List<Employee> findAllEmployees(){
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

    public List<CongeDemande> findConge() {
        return congeRepository.findAll();
    }
    public List<CongeState> findCongeState() {
        return congeStateRepository.findAll();
    }

    public CongeDemande addCongeDemande(CongeDemande congeDemande) {
        return congeRepository.save(congeDemande);
    }

    public CongeDemande updateCongeDemande(CongeDemande congeDemande) {
        return congeRepository.save(congeDemande);
    }

    public void deleteCongeDemande(Long id) {
        congeRepository.deleteCongeDemandeById(id);
    }

    public List<Annonce> findAnnonce() {
        return annonceRepository.findAll();
    }

    public List<Annonce> findAnnonceById(Long id) {
        return annonceRepository.findAnnonceById(id);
    }
}