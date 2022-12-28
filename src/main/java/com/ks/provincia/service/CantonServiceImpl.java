package com.ks.provincia.service;

import com.ks.provincia.model.Canton;
import com.ks.provincia.repository.CantonRepository;
import com.ks.provincia.repository.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CantonServiceImpl implements ICanton{


    @Autowired
    private CantonRepository cantonRepository;


    @Override
    public Canton saveCanton(Canton canton) {
        return cantonRepository.save(canton);
    }

    @Override
    public void deleteCanton(Long id) {
        cantonRepository.deleteById(id);
    }

    @Override
    public List<Canton> findAllCantones() {
        return cantonRepository.findAll();
    }
}
