/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.burguer_eats.Repositorios;

import com.example.burguer_eats.Clases.Empleado;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface IEmpleado extends CrudRepository<Empleado, Integer>{
    
    //Aqui pueden ir consultas a BD adicionales
    @Query(value="SELECT * FROM empleado", nativeQuery = true)
    List<Empleado> buscarPorTodo(String desc);
}
