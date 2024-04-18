package com.api.metricaCargaDatos.services;

import com.api.metricaCargaDatos.repositories.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.metricaCargaDatos.models.AlumnoModel;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    IAlumnoRepository alumnoRepository;

    public ArrayList<AlumnoModel> getAlumnos(){
        return (ArrayList<AlumnoModel>) alumnoRepository.findAll();
    }

    public AlumnoModel saveAlumno(AlumnoModel alumno){
        return alumnoRepository.save(alumno);
    }

    public Optional<AlumnoModel> getAlumnoById(Long id){
        return alumnoRepository.findById(id);
    }

    public AlumnoModel updateAlumno(AlumnoModel request, Long id){

//        AlumnoModel alumno = alumnoRepository.findById(id).get();

        AlumnoModel alumno = alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado con id: " + id));
        alumno.setNombre(request.getNombre());
        alumno.setApellido(request.getApellido());
        alumno.setCarnet(request.getCarnet());
        alumno.setCorreoElectronico(request.getCorreoElectronico());
        alumno.setFechaNacimiento(request.getFechaNacimiento());

        return alumno;

    }


    public Boolean deleteAlumno(Long id){
        try {
            alumnoRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }



}
