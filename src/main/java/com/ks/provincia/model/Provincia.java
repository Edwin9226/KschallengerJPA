package com.ks.provincia.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "provincia")
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonManagedReference
    @OneToMany(
            mappedBy = "wtProvincia",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Canton> wtCantons= new ArrayList<>();

    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;


}
