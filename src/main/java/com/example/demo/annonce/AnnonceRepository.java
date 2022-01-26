package com.example.demo.annonce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
    List<Annonce> findAnnonceById(Long id);

    void deleteAnnonceById(Long id);
}
