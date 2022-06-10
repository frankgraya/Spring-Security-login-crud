package com.example.Spring_boot_login_crud.models;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Data
@Table(name="clientes")
public class Cliente implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    private String nombres;


    private String apellidos;



    private String telefono;


    private String email;

    @ManyToOne
    @JoinColumn(name="ciudades_id")
    private Ciudad ciudad;


}
