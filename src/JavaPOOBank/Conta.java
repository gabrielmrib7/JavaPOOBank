/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPOOBank;



/**
 *
 * @author PICHAU
 */
public class Conta {
    private int id_conta;
    private int numeroc;
    private int senha;
    private double saldo;
    
   
    
    public Conta(int id, int nc, int p, double s)
    {
        this.id_conta = id;
        this.numeroc = nc;
        this.senha = p;
        this.saldo = s;
    }

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public int getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(int numeroc) {
        this.numeroc = numeroc;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Depositar(double deposito)
    {
        this.saldo = saldo + deposito;
    }
    
    public void Sacar(double saque)
    {
    this.saldo = saldo - saque;
    }
}
