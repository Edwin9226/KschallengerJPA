package com.ks.provincia.service;

import com.ks.provincia.model.Provincia;

import java.util.List;

public interface IProvincia {

    Provincia saveProvincia( Provincia provincia);
    void deleteProvincia(Long id);
    List<Provincia> findAllProvincias();
}
