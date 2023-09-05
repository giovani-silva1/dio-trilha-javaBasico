package br.com.contaBancaria.model;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        int numeroConta = sc.nextInt();
        System.out.println("Digite a agencia da conta");
        String agencia  = sc.next();
        sc.nextLine();
        System.out.println("Digite o nome do cliente");
        String nomeCliente = sc1.nextLine();
        System.out.println("Digite o saldo em conta");
        double saldoConta = sc.nextDouble();

        Conta conta = new Conta(numeroConta,agencia,nomeCliente,saldoConta);
        System.out.println("Ola " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + conta.agencia +", conta " + conta.numero + "e seu saldo " + conta.saldo + " já esta disponível para saque.");
    }
}
