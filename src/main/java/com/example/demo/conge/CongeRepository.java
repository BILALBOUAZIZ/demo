package com.example.demo.conge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongeRepository extends JpaRepository<CongeDemande,Long> {

    void deleteCongeDemandeById(Long id);
}
