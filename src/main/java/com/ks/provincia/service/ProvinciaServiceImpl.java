package com.ks.provincia.service;

import com.ks.provincia.model.Provincia;
import com.ks.provincia.repository.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinciaServiceImpl implements IProvincia{

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Override
    public Provincia saveProvincia(Provincia provincia) {

        return provinciaRepository.save(provincia);
    }

    @Override
    public void deleteProvincia(Long id) {
        provinciaRepository.deleteById(id);
    }

    @Override
    public List<Provincia> findAllProvincias() {
        return provinciaRepository.findAll();
    }
}
