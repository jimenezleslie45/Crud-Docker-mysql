package com.crudsql.cruddocker.service;

import com.crudsql.cruddocker.dao.EstudianteDAO;
import com.crudsql.cruddocker.entities.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements com.crudsql.cruddocker.service.EstudianteService {
    @Autowired
    private EstudianteDAO estudianteDAO;

    @Override
    public List<Estudiante> findAll() {
        return (List<Estudiante>) estudianteDAO.findAll();
    }

    @Override
    public Object findById(Long id){
        return estudianteDAO.findById(id).orElse(null);
    }

    @Override
    public Estudiante findByNombre(String nombre){
        return estudianteDAO.findByNombre(nombre);
    }

    @Override
    public void createEstudiante(Estudiante estudiante) {
        estudianteDAO.save(estudiante);
    }

    @Override
    public void modifyEstudiante(Long id, Estudiante estudiante) {
        if(estudianteDAO.existsById(id)){
            estudiante.setId(id);
            estudianteDAO.save(estudiante);
        }
    }

    @Override
    public void deleteEstudiante(Long id) {
        if(estudianteDAO.existsById(id)){
            estudianteDAO.deleteById(id);
        }
    }
}
