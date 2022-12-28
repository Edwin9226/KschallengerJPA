package com.ks.provincia.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "parroquia")
public class Parroquia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "canton_id")
    private Canton wtCanton;

    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;





}
