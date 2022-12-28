package com.ks.provincia.repository;

import com.ks.provincia.model.Parroquia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParroquiaRepository extends JpaRepository<Parroquia, Long> {

}
