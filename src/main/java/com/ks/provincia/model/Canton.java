package com.ks.provincia.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "canton")
public class Canton {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonManagedReference
    @OneToMany(
            mappedBy = "wtCanton",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Parroquia> wtParroquias= new ArrayList<>();
@JsonBackReference
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "provincia_id")
 private Provincia wtProvincia;


 @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;

}
