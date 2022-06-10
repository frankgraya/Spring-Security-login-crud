package com.example.Spring_boot_login_crud.service;

import java.util.List;

import com.example.Spring_boot_login_crud.models.Ciudad;
import com.example.Spring_boot_login_crud.repository.CiudadRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImpl implements ICiudadService{
    @Autowired
    private CiudadRespository ciudadRepository;

    @Override
    public List<Ciudad> listaCiudades() {

        return (List<Ciudad>) ciudadRepository.findAll();
    }
}
