import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);
        String nome = "Edson Suraty";
        String tipoDeConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;
        double valor = 0;

        System.out.println("**************************");
        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("Tipo da Conta: %s", tipoDeConta));
        System.out.println(String.format("Saldo da conta: R$%.2f", saldo));
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
                    System.out.println(String.format("Seu saldo atual é: R$%.2f", saldo));
                    break;
                }
                case 2:{
                    System.out.println("Digite o valor a ser transferido: ");
                    valor = entradaDeDados.nextDouble();
                    if (valor <= 0) {
                        System.out.println("Digite um valor positivo.");
                        break;
                    }
                    if(valor > saldo){
                        System.out.println("Valor indisponível para transferência.");
                        break;
                    }

                    saldo -= valor;
                    System.out.println(String.format("R$%.2f transferido com sucesso. Seu saldo atual é: R$%.2f", valor, saldo));
                    break;
                }
                case 3: {
                    System.out.println("Digite o valor a ser recebido: ");
                    valor = entradaDeDados.nextDouble();
                    if (valor <= 0) {
                        System.out.println("Digite um valor positivo.");
                        break;
                    }
                    saldo += valor;
                    System.out.println(String.format("R$%.2f recebido com sucesso. Seu saldo atual é: R$%.2f", valor, saldo));
                    break;
                }
                case 4:{
                    System.out.println(String.format("O seu saldo final é R$%.2f. Volte sempre!", saldo));
                    break;
                }
                default:{
                    System.out.println("Opção inválida. Selecione uma opção válida");
                }
            }
        }
    }
}