/*

- Inicializar dados do cliente - ok
- Menu de opções - ok
- Visualização do saldo
- Enviar valor
- Receber valor

 */

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);
        String nome = "Edson Suraty";
        String tipoDeConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("**************************");
        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("Tipo da Conta: %s", tipoDeConta));
        System.out.println(String.format("Saldo da conta: %.2f", saldo));
        System.out.println("**************************");

        String menu = """
                ** Escolha uma das opções abaixo **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;

        while(opcao !=4){
            System.out.println(menu);
            opcao = entradaDeDados.nextInt();

            switch (opcao){
                case 1:{
                    System.out.println(String.format("Seu saldo atual é: %.2f", saldo));
                    break;
                }
                case 2:{
                    System.out.println("Digite o valor a ser transferido: ");
                    double valor = entradaDeDados.nextDouble();

                    if(valor > saldo){
                        System.out.println("Valor indisponível para transferência.");
                        break;
                    };

                    saldo -= valor;
                    System.out.println(String.format("%.2f transferido com sucesso. Seu saldo atual é: %.2f", valor, saldo));
                    break;
                }
            }
        }
    }
}