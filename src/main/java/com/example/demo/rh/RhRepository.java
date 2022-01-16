package com.example.demo.rh;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RhRepository
        extends JpaRepository<RhRes, Long> {
}
