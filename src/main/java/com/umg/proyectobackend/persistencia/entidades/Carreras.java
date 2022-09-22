package com.umg.proyectobackend.persistencia.entidades;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="carreras")
public class Carreras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_carrera")
    private Integer idCarrera;

    @Column(name="nombre_carrera")
    private String nombreCarrera;

    @Column(name = "descripcion_carrera")
    private String descripcionCarrera;

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getDescripcionCarrera() {
        return descripcionCarrera;
    }

    public void setDescripcionCarrera(String descripcionCarrera) {
        this.descripcionCarrera = descripcionCarrera;
    }
}
