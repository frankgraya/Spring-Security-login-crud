package com.example.Spring_boot_login_crud.repository;


import com.example.Spring_boot_login_crud.models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
