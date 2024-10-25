package com.maska.web.repository;

import com.maska.web.model.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembreRepository extends JpaRepository<Membre , Long> {
}
