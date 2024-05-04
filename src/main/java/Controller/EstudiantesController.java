package com.crudsql.cruddocker.controller;

import com.crudsql.cruddocker.dao.EstudianteDAO;
import com.crudsql.cruddocker.entities.Estudiante;
import com.crudsql.cruddocker.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
    @Autowired
    EstudianteService estudianteService;
    @Autowired
    private EstudianteDAO estudianteDAO;

    @GetMapping
    public List<Estudiante> listarEstudiantes(){
        return estudianteService.findAll();
    }

    @GetMapping("/{id}")
    public Estudiante obtenerEstudiante(@PathVariable Long id){
        return (Estudiante) estudianteService.findById(id);
    }

    @GetMapping("/estudiantes/{nombre}")
    public Estudiante obtenerEstudianteporNombre(@PathVariable String nombre){
        return estudianteService.findByNombre(nombre);
    }

    @PostMapping
    public void guardarEstudiante(@RequestBody Estudiante estudiante){
        estudianteService.createEstudiante(estudiante);
    }

    @PutMapping("/{id}")
    public void actualizarEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante){
        estudianteService.modifyEstudiante(id,estudiante);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable Long id){
        estudianteService.deleteEstudiante(id);
    }
}