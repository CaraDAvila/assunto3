package ex5;

import Filas.FilaString;
import ex3Alunos.FilaInt;

import java.util.Scanner;

public class Consultorio {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        FilaString queue = new FilaString();
        queue.init();

        int option;
        do {
            {
                System.out.println("1-Insere paciente:");
                System.out.println("2-Atende paciente");
                System.out.println("3-[ENCERRAR]");
                option = inp.nextInt();


                switch (option) {
                    case 1:
                        System.out.printf("Informe nome:");
                        inp.nextLine();
                        String nome = inp.nextLine();
                        queue.enqueue(nome);
                        break;
                    case 2:
                        System.out.println("Paciente a atender:");
                        if (!queue.isEmpty()) {
                            System.out.println("[Paciente " + queue.dequeue() + "] sera atendido");
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
        }
        while (option != 3) ;
    }
}
