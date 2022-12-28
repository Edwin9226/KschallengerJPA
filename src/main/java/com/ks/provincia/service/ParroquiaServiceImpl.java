package com.ks.provincia.service;

import com.ks.provincia.model.Parroquia;
import com.ks.provincia.repository.ParroquiaRepository;
import com.ks.provincia.repository.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ParroquiaServiceImpl implements IParroquia{

    @Autowired
    private ParroquiaRepository parroquiaRepository;

    @Override
    public Parroquia saveParroquia(Parroquia parroquia) {
        return parroquiaRepository.save(parroquia);
    }

    @Override
    public void deleteParroquia(Long id) {
parroquiaRepository.deleteById(id);
    }

    @Override
    public List<Parroquia> findAllParroquias() {
        return parroquiaRepository.findAll();
    }
}
