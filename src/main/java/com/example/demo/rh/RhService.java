package com.example.demo.rh;

import com.example.demo.annonce.Annonce;
import com.example.demo.annonce.AnnonceRepository;
import com.example.demo.conge.CongeState;
import com.example.demo.conge.CongeStateRepository;
import com.example.demo.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RhService {
    private final RhRepository rhRepository;
    private final CongeStateRepository congeStateRepository;
    private final AnnonceRepository annonceRepository;


    @Autowired
    public RhService(RhRepository rhRepository, CongeStateRepository congeStateRepository, AnnonceRepository annonceRepository) {
        this.rhRepository = rhRepository;
        this.congeStateRepository = congeStateRepository;
        this.annonceRepository = annonceRepository;
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

    public CongeState addCongeState(CongeState congeState) {
        return congeStateRepository.save(congeState);
    }

    public CongeState updateCongeState(CongeState congeState) {
        return congeStateRepository.save(congeState);
    }

    public void deleteCongeState(Long id) {
        congeStateRepository.deleteCongeStateById(id);
    }

    public Annonce addAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }

    public Annonce updateAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }

    public void deleteAnnonce(Long id) {
        annonceRepository.deleteAnnonceById(id);
    }
}
