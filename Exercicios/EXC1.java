package exercicios;

import java.util.Scanner;

public class exc1 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (triangulo(numero)){
            System.out.println("O número " + numero + " é triangular" );
        }else {
            System.out.println("Não é um número triangular");
        }

    }
    public static boolean triangulo(int numero){
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        while (num1 * num2 * num3 < numero){

            num1 = num2;
            num2 = num3;
            num3++;


        }
        return num1 * num2 * num3 == numero;
    }

}
