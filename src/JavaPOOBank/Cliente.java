/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPOOBank;

import java.util.ArrayList;

/**
 *
 * @author PICHAU
 */
public class Cliente {
    
    private int id_cliente;
    private String nome;
    private String cpf;
    private int numeroconta;
    public ArrayList<Cliente> Clientes;
    
    
    public Cliente(int id, String n, String c, int nc)
    {
        this.id_cliente = id;
        this.numeroconta = nc;
        this.cpf = c;
        this.nome = n;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getnumeroconta() {
        return numeroconta;
    }

    public void setnumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }
    
}
