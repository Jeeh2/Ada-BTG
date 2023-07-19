package exercicios;

import java.util.Scanner;

public class exc2 {

    public static void main(String[] args){

        final exc2 menu = new exc2();
        menu.operadores();

    }

    public void operadores() {

       final Scanner scanner = new Scanner(System.in);




        System.out.println("Digite opção 1 para multiplicar");
        System.out.println("Digite opção 2 para dividir");

        int opcao = scanner.nextInt();

        switch (opcao){
            case 1 -> mult();
            case 2 -> div();
        }
    }
    public void mult(){
        int n1;
        int n2;
        int count = 0;

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();

        for(int i = 0; i < n2; i++){
            count += n1;
        }

        System.out.printf("Multiplicação: " + count);
    }
     public void div(){
         int n1;
         int n2;
         int count = 0;

         final Scanner scanner = new Scanner(System.in);
         System.out.println("Digite o primeiro número: ");
         n1 = scanner.nextInt();
         System.out.println("Digite o segundo número: ");
         n2 = scanner.nextInt();

         int rest = n1 - n2;
         int divisao = 0;

         if(n2 > n1 || n2 == 0){
             System.out.println("Não é possível realizar essa divisão!");
         }else {
             while (rest >= 0) {
                 rest -= n2;
                 divisao++;
             }
         }
         System.out.println("Divisão: " + divisao);

     }

}
