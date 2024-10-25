package com.maska.web.services;

import com.maska.web.model.Membre;
import com.maska.web.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreService {

    private MembreRepository membreRepository;

    public MembreService(MembreRepository membreRepository) {
        this.membreRepository = membreRepository;
    }

    public List<Membre> findAll() {
        return membreRepository.findAll();
    }

}
