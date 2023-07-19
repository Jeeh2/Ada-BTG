package exercicios;

import dia1.Dia03;

import java.util.LinkedList;
import java.util.Scanner;

public class exc3 {

    LinkedList<String> filaPreferencial = new LinkedList<>();
    LinkedList<String> filaComum = new LinkedList<>();

    int contagemPreferencial = 1;
    int contagemComum = 1;

    public static void main(String[] args) {

        final exc3 menu = new exc3(); //instancia
        menu.escolherOpcao();

    }

    public void escolherOpcao() {

        final Scanner scanner = new Scanner(System.in, "UTF-8");


            System.out.println("Escolha um das opções abaixo:");
            System.out.println("1 - Emitir senha COMUM");
            System.out.println("2 - Emitir senha PREFERENCIAL");
            System.out.println("3 - Chamar a próxima senha");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> emitirSenhaComum();
                case 2 -> emitirSenhaPreferencial();
                case 3 -> chamarProximaSenha();
                case 4 -> {
                    sair();
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }

    

    public void  emitirSenhaPreferencial() {

        String senhaPreferencialFormatada = String.format("P%03d", contagemPreferencial++);
        filaPreferencial.offer(senhaPreferencialFormatada);
        System.out.println("Senha preferencial: " + senhaPreferencialFormatada);
        System.out.println("--------------------------");
        escolherOpcao();
    }

    public String emitirSenhaComum() {

        String senhaComumFormatada = String.format("C%03d", contagemComum++);
        filaComum.offer(senhaComumFormatada);
        System.out.println("Senha comum: " + senhaComumFormatada);
        System.out.println("--------------------------");
        escolherOpcao();
        return senhaComumFormatada;
    }

    public void chamarProximaSenha(){

        if(filaPreferencial.size() > 0 ){
            System.out.println("Próxima senha: " + filaPreferencial.poll());
        } else if (filaComum.size() > 0) {
            System.out.println("Próxima senha: " + filaComum.poll());
        }
        else {
            System.out.println("Não há nenhuma senha a ser chamada");
        }

        escolherOpcao();
    }

    public void sair(){

      
    }
}

