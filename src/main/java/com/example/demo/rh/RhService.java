package com.example.demo.rh;

import com.example.demo.exception.UserNotFoundException;
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

     void deleteRhRes(Long id) {
        rhRepository.deleteRhResById(id);
    }

    public RhRes findRhResById(Long id) {
        return rhRepository.findRhResById(id)
                .orElseThrow(() -> new UserNotFoundException("rh responsable by id "+id+" was not found"));
    }

    public List<RhRes> findAllRhRes() {
        return rhRepository.findAll();
    }

    public RhRes addRhRes(RhRes rhRes) {
        return rhRepository.save(rhRes);
    }

    public RhRes updateRhRes(RhRes rhRes) {
        return rhRepository.save(rhRes);
    }
}
