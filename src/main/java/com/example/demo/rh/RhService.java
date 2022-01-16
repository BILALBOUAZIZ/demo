package com.example.demo.rh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RhService {
    private final RhRepository rhRepository;

    @Autowired
    public RhService(RhRepository rhRepository) {
        this.rhRepository = rhRepository;
    }

    public List<RhRes> getRhRes() {
        return rhRepository.findAll();
    }
}
