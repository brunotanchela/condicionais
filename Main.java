import java.util.Scanner;

public class Main {             // Programa que calcula o desconto de uma compra com base no valor da compra
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               // "Sacanner" é como (input) em Python: lê dados inseridos pelo usuário

        System.out.print("Qual o valor da compra? ");
        double valorCompra = scanner.nextDouble();

        double percentual;

        // Condicionais if, else if (como o elif em Python) e else:
        if (valorCompra < 200.0) {
            percentual = 5.0;
        } else if (valorCompra >= 200.0 && valorCompra < 300.0) {
            percentual = 10.0;
        } else {
            percentual = 15.0;
        }

        double desconto = valorCompra * (percentual / 100);             // Calcula o desconto
        double valorFinal = valorCompra - desconto;             // Mostra o preço final com o desconto aplicado

        System.out.println("Desconto: " + desconto);
        System.out.println("Valor final: " + valorFinal);

        scanner.close();                // Fecha o scanner para não gastar memória desnecessariamente.
    }
}