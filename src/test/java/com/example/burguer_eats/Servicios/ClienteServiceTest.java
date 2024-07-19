package com.example.burguer_eats.Servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.burguer_eats.Clases.Cliente;
import com.example.burguer_eats.Controller.ClienteControlador;
import com.example.burguer_eats.Interfaces.IClienteService;

public class ClienteServiceTest {
    @InjectMocks
    private ClienteService clienteService;
    @Mock
    private IClienteService iClienteService;
    Cliente cliente;
    @BeforeEach
    public void setUp() {
        
        MockitoAnnotations.openMocks(this);

        // Crea un cliente simulado
        cliente  = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setDni("12345678");
        cliente.setCelular("987654321");
        cliente.setEmail("correo@gmail.com");
        cliente.setDireccion("Av. Los Alamos 123");


    }
    @Test
    public void testBuscarPorEmail() {

        when(iClienteService.BuscarPorEmail("correo@gmail.com")).thenReturn(cliente);
        Cliente clienteTest = iClienteService.BuscarPorEmail("correo@gmail.com");
        
        if(clienteTest == null) {
            System.out.println("No se encontro el cliente");
            fail("No se encontro el cliente");
        }
        else {
            assertEquals("Juan", cliente.getNombre());
            System.out.println("Se encontro el cliente: " + clienteTest.getNombre() + " " + clienteTest.getApellido());
        }
        

    }





    
}
