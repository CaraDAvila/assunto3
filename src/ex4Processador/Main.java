package ex4Processador;

import ex3Alunos.FilaInt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ex3Alunos.FilaInt queue = new FilaInt();


        int option;
        {
            System.out.println("1-insere");
            System.out.println("2-executa");
            System.out.println("3-[ENCERRAR]");
            option = inp.nextInt();

            switch (option)
            {
                case 1:
                    System.out.printf("Informe PID:");
                    int id = inp.nextInt();
                    queue.enqueue(id);
                    break;
                case 2:
                    System.out.printf("processo a remover:");
                    if (queue.isEmpty()) {
                        System.out.println("processo deve retornar ao final da fila.");
                    } else {
                        id = queue.dequeue();
                        System.out.println("[processo" + id + "sendo executado]");
                        System.out.printf("processso concluido? (1sim)");
                        int ans = inp.nextInt();
                        if (ans == 1) {
                            System.out.println("[CONCLUIDO]");
                        } else {
                            System.out.println("processo voltou a fila");
                            queue.enqueue(id);
                        }

                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("ainda ha processos em execução");

                        System.out.println("deseja realmente  encerrar? (1sim)");
                        int ans = inp.nextInt();
                        if (ans == 1) {
                            while (!queue.isEmpty()){
                                queue.dequeue();
                                System.out.println("[processo" + queue.dequeue() + "sendo encerrado]");
                            }

                        } else {
                            option = 0;

                        }
                    }
                    break;
                default:
                    System.out.println("[?]ERRO");
            }

        }
        while (option!=3);
        System.out.println("[ENCERRADO]");
    }


}
