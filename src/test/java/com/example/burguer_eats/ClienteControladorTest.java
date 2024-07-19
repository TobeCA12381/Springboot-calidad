package com.example.burguer_eats;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.ui.Model;

import com.example.burguer_eats.Clases.Cliente;
import com.example.burguer_eats.Controller.ClienteControlador;
import com.example.burguer_eats.Interfaces.IClienteService;

public class ClienteControladorTest {
    @InjectMocks
    private ClienteControlador clienteControlador;
    @Mock
    private IClienteService clienteService;
   
    private Model model;
    @BeforeEach
    public void setUp() {
        // Crea un servicio simulado
        clienteService = mock(IClienteService.class);
        // Crea un controlador con el servicio simulado
        clienteControlador = new ClienteControlador(clienteService);

        // Crea un modelo simulado
        model = mock(Model.class);

        // Crea una lista simulada de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente());
        clientes.add(new Cliente());
        clientes.add(new Cliente());

        // Define el comportamiento del servicio simulado
        when(clienteService.Listar()).thenReturn(clientes);

        // Define el comportamiento del modelo simulado
        when(model.addAttribute(anyString(), any())).thenReturn(model);



    }

    @Test
    public void testMostrar() {
        // Llamar al método del controlador
        String resultado = clienteControlador.Mostrar(model);

        // Verificar que el servicio fue llamado con los valores correctos
        verify(clienteService, times(1)).Listar();

        // Verificar que el método devuelve la vista "clientes" (o la que esperes)
        assertEquals("clientes", resultado);

        // Verificar que el modelo se haya agregado con éxito (si es necesario)
        // Puedes hacer más aserciones sobre el modelo si es necesario
        verify(model, times(1)).addAttribute(anyString(), any());
    }

    @Test
    public void testRegistrar() {
        // Datos de prueba
        String nom = "John";
        String ape = "Doe";
        String dni = "12345678";
        String cel = "987654321";
        String email = "john@example.com";
        String dir = "123 Main St";
        String pass = "secreto";

        // Llamar al método del controlador
        String resultado = clienteControlador.Registrar(nom, ape, dni, cel, email, dir, pass, model);

        // Verificar que el servicio fue llamado con los valores correctos
        Cliente cliente = new Cliente();
        cliente.setNombre(nom);
        cliente.setApellido(ape);
        cliente.setDni(dni);
        cliente.setCelular(cel);
        cliente.setEmail(email);
        cliente.setDireccion(dir);
        cliente.setContraseña(pass);
        verify(clienteService, times(1)).Guardar(cliente);

        // Verificar que el método devuelve la vista "inicio" (o la que esperes)
        assertEquals("inicio", resultado);

        // Verificar que el modelo se haya agregado con éxito (si es necesario)
        // Puedes hacer más aserciones sobre el modelo si es necesario
        verify(model, times(1)).addAttribute(anyString(), any());
    }

    // Agrega tests para otros métodos según sea necesario
}
