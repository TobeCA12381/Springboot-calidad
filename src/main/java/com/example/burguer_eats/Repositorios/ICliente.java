/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.burguer_eats.Repositorios;

import com.example.burguer_eats.Clases.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ICliente extends CrudRepository<Cliente, Integer> {
    
    //Aqui pueden ir consultas a BD adicionales
    @Query(value="SELECT * FROM cliente", nativeQuery = true)
    List<Cliente> buscarPorTodo(String desc);

    @Query(value="SELECT * FROM cliente where email = ?1 limit 1", nativeQuery = true)
    Cliente buscarPorEmail(String email);
}
