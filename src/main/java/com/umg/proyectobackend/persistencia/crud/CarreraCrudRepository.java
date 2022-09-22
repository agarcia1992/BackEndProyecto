package com.umg.proyectobackend.persistencia.crud;

import com.umg.proyectobackend.persistencia.entidades.Carreras;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CarreraCrudRepository extends CrudRepository<Carreras,Integer> {
    Optional<List<Carreras>> findByNombreCarrera(String nombreCarrera);
}
