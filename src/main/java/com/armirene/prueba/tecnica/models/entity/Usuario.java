package com.armirene.prueba.tecnica.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "USUARIO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column (name = "APELLIDO")
    private String apellido;
    @Column(name = "NOMBRE_USUARI")
    private String nombreUsuario;
}
