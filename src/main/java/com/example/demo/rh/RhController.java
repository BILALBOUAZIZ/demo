package com.example.demo.rh;

import com.example.demo.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "/v1/rh")
public class RhController {
    private final RhService rhService;
    @Autowired
    public RhController(RhService rhService) {
        this.rhService = rhService;
    }

    @GetMapping
    public List<RhRes> getRhRes(){
        return rhService.getRhRes();

    }
}
