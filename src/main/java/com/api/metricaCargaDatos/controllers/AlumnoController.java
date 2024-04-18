package com.api.metricaCargaDatos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.metricaCargaDatos.services.AlumnoService;
import com.api.metricaCargaDatos.models.AlumnoModel;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public ArrayList<AlumnoModel> getAlumnos(){
        return alumnoService.getAlumnos();
    }

    @PostMapping
    public AlumnoModel saveAlumno(@RequestBody AlumnoModel alumno){
        return alumnoService.saveAlumno(alumno);
    }

    @GetMapping(path = "/{id}")
    public Optional<AlumnoModel> getAlumnoById(@PathVariable("id") Long id){
        return this.alumnoService.getAlumnoById(id);
    }

    @PutMapping(path = "/{id}")
    public AlumnoModel updateAlumo(@RequestBody AlumnoModel request, @PathVariable("id") Long id){
        return this.alumnoService.updateAlumno(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteAlumno(@PathVariable("id") Long id){
        Boolean result = this.alumnoService.deleteAlumno(id);
        if(result){
            return "Se ha eliminado el alumno con id: " + id;
        }   else {
            return "No se ha podido eliminar el alumno con id: " + id;
        }
    }







}
