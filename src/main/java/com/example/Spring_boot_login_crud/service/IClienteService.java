package com.example.Spring_boot_login_crud.service;

import com.example.Spring_boot_login_crud.models.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> listarTodos();
    public void guardar(Cliente cliente);
    public Cliente buscarPorId(Long id);
    public void eliminar(Long id);

}
