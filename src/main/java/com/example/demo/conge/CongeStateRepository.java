package com.example.demo.conge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongeStateRepository extends JpaRepository<CongeState,Long> {
    void deleteCongeStateById(Long id);
}
