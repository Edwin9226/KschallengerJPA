package com.ks.provincia.service;

import com.ks.provincia.model.Canton;
import com.ks.provincia.model.Provincia;

import java.util.List;

public interface ICanton {
    Canton saveCanton(Canton canton);
    void deleteCanton(Long id);
    List<Canton> findAllCantones();
}
