package com.example.demo.rh;

import com.example.demo.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/rh")
public class RhController {
    private final RhService rhService;
    @Autowired
    public RhController(RhService rhService) {
        this.rhService = rhService;
    }

    @GetMapping
    public ResponseEntity<List<RhRes>> getRhRes() {
        List<RhRes> rhres = rhService.findAllRhRes();
        return new ResponseEntity<>(rhres, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<RhRes> getRhResById(@PathVariable("id") Long id) {
        RhRes rhres = rhService.findRhResById(id);
        return new ResponseEntity<>(rhres, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<RhRes> AddRhRes(@RequestBody RhRes rhRes){
        RhRes newRhRes =  rhService.addRhRes(rhRes);
        return new ResponseEntity<>(newRhRes, HttpStatus.CREATED) ;
    }
    @PutMapping("/update")
    public  ResponseEntity<RhRes> updateRhRes(@RequestBody RhRes rhRes){
        RhRes updateRhRes =  rhService.updateRhRes(rhRes);
        return new ResponseEntity<>(updateRhRes, HttpStatus.OK) ;
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteRhRes(@PathVariable("id") Long id){
        rhService.deleteRhRes(id);
        return new ResponseEntity<>(HttpStatus.CREATED) ;
    }
}
