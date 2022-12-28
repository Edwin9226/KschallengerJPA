package com.ks.provincia.service;

import com.ks.provincia.model.Canton;
import com.ks.provincia.model.Parroquia;

import java.util.List;

public interface IParroquia {

    Parroquia saveParroquia(Parroquia parroquia);
    void deleteParroquia(Long id);
    List<Parroquia> findAllParroquias();
}
