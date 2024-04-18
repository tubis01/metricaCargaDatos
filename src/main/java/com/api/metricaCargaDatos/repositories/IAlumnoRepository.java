package com.api.metricaCargaDatos.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.metricaCargaDatos.models.AlumnoModel;

@Repository
public interface IAlumnoRepository extends JpaRepository < AlumnoModel, Long> {




}
