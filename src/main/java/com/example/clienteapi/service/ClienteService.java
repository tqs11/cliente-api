/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.clienteapi.service;

import com.example.clienteapi.model.Cliente;
import java.util.List;

/**
 *
 * @author carlos
 */
public interface ClienteService {
    Cliente crearCliente(Cliente cliente);
    Cliente actualizarCliente(Long id, Cliente clienteDetails);
    Cliente obtenerClientePorId(Long id);
    List<Cliente> obtenerTodosLosClientes();
    void eliminarCliente(Long id);
    
}
