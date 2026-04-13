package ex3Alunos;

import java.util.Scanner;

public class AtendimentoAlunos {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        FilaInt queue = new FilaInt();


        int option;
        {
            System.out.println("1-RM do aluno:");
            System.out.println("2-Retirar aluno");
            System.out.println("3-[ENCERRAR]");
            option = inp.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Informe rm:");
                    int rm = inp.nextInt();
                    queue.enqueue(rm);
                    break;
                case 2:
                    System.out.printf("Aluno a remover:");
                    if (!queue.isEmpty()) {
                        System.out.println("[Aluno " + queue.dequeue() + "] sera atendido");
                    } else {
                        System.out.println("fila vazia");
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("[?]ERRO");
                        option = 0;
                    }
                    break;
                default:
                    System.out.println("[?]ERRO");
            }
        }
        while (option != 3) ;
    }


}
