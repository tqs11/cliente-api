/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.clienteapi;

import com.example.clienteapi.model.Cliente;
import com.example.clienteapi.repository.ClienteRepository;
import com.example.clienteapi.service.ClienteServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

//import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author carlos
 */
public class ClienteServiceTest {
    
    @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteServiceImpl clienteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void crearCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Test");
        cliente.setEmail("test@test.com");

        when(clienteRepository.save(any(Cliente.class))).thenReturn(cliente);

        Cliente resultado = clienteService.crearCliente(cliente);
        assertNotNull(resultado);
        assertEquals("Test", resultado.getNombre());
    }
    

    // Agrega más pruebas para los otros métodos
    
}
