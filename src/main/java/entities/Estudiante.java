package com.crudsql.cruddocker.entities;

import entities.GenerationType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;

    @Column(name="fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    private int ciclo;
    private String carrera;

    public Estudiante() {
        // Constructor vacío requerido por JPA
    }

    public Long getId() {
        return id != null ? id : 0L;
    }

    public void setId(Long id) {
        if (id != null) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
