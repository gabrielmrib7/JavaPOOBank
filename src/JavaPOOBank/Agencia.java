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
public class Agencia {
    
    static ArrayList<Conta> contasBancarias;
     static ArrayList<Cliente> Clientes;
     
     int index;

    public static void main() {
        contasBancarias = new ArrayList<>();
        Clientes = new ArrayList<>();
 
    }
    
    public static void criarConta(int id, int nc, int p, double s) {
          Conta conta = new Conta(id, nc, p, s);
            contasBancarias.add(conta);
            System.out.println("id:" + id);
    }
    public static void criarCliente(int id, String n, String c, int nc) {
        Cliente cliente = new Cliente(id, n, c, nc);
        Clientes.add(cliente);
    }
        
    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
    
    
    
    public static void Transferir(int nc, int valor, int ca)
    {
    contasBancarias.get(nc).Depositar(valor);
    contasBancarias.get(ca).Sacar(valor);
    
    
    }
}
