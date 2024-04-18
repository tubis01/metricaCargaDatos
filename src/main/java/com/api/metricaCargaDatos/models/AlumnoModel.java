package com.api.metricaCargaDatos.models;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos")
public class AlumnoModel {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        //Carnet, Nombres, Adpellidos, correoElectronico, fechaNacimiento
        @Column
        private String nombre;

        @Column
        private String apellido;

        @Column
        private String carnet;

        @Column
        private String correoElectronico;

        @Column
        private String fechaNacimiento;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "pago_id", referencedColumnName = "id")
        private PagoModel modelpago;


        public PagoModel getModelpago() {
            return modelpago;
        }

        public void setModelpago(PagoModel modelpago) {
            this.modelpago = modelpago;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
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

        public String getCarnet() {
            return carnet;
        }

        public void setCarnet(String carnet) {
            this.carnet = carnet;
        }

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }
    }

