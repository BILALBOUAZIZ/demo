package com.example.demo.rh;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RhRepository
        extends JpaRepository<RhRes, Long> {

   Optional<RhRes> findRhResById(Long id);

   void deleteRhResById(Long id);

}
