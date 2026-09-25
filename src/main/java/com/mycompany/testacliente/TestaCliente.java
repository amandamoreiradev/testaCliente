/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testacliente;

/**
 *
 * @author Amanda
 */
public class TestaCliente {

    public static void main(String[] args) {
    Endereco endereco = new Endereco("Rua das Flores, 123", "São Paulo", "SP");
    Cliente cliente = new Cliente(1, "Maria Silva", endereco);
    
    System.out.println(cliente);
    }
}
