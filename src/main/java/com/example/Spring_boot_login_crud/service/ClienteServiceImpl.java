package com.example.Spring_boot_login_crud.service;

import com.example.Spring_boot_login_crud.models.Cliente;
import com.example.Spring_boot_login_crud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarTodos() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public void guardar(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public Cliente buscarPorId(Long id)  {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id){
        clienteRepository.deleteById(id);
    }



}
