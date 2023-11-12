package src;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean campoValido = false;

        int numConta;
        String nomeCliente;
        String numAgencia;
        double saldo;

        do{
            System.out.println("Por Favor, digite o número da conta:");
            numConta = sc.nextInt();
            if(numConta <= 0){
                System.out.print("Numero da Conta Informado inválido!");
            }else{
                campoValido = true;
            }
        }while (campoValido == false);

        System.out.println("Por Favor, digite o número da agência:");
        numAgencia = sc.next();

        System.out.println("Por Favor, digite o nome do cliente:");
        nomeCliente = sc.next();

        System.out.println("Por Favor, digite o saldo da conta:");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                           " sua agência é " + numAgencia +"," +
                           " conta " + numConta +" e seu saldo " + saldo + " já está disponível para saque.");
    }
}
