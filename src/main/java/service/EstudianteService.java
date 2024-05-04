package com.crudsql.cruddocker.service;

import com.crudsql.cruddocker.entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    public List<Estudiante> findAll();

    public Object findById(Long id);

    public Estudiante findByNombre(String nombre);

    public void createEstudiante(Estudiante estudiante);

    public void modifyEstudiante(Long id, Estudiante estudiante);

    public void deleteEstudiante(Long id);
}
