package com.crudsql.cruddocker.dao;

import Dao.CrudRepository;
import com.crudsql.cruddocker.entities.Estudiante;

import java.util.Optional;


public interface EstudianteDAO extends CrudRepository<Estudiante, Long> {
    Estudiante findByNombre(String nombre);

    void deleteById(Long id);

    boolean existsById(Long id);

    void save(com.crudsql.cruddocker.entities.Estudiante estudiante);

    Object findAll();

    Optional<Object> findById(Long id);
}