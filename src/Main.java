import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        FilaInt filaInt = new FilaInt();
        int rm;


        filaInt.init();
        System.out.println("RM do aluno:    ");
        rm = inp.nextInt();

        if (filaInt.isEmpty()) {
            System.out.println("[FULL QUEUE]");
        } else {
            System.out.println("Valor retirado: " + filaInt.dequeue());
        }
        while (!filaInt.isEmpty()) {
            System.out.println("Valor retirado: " + filaInt.dequeue());
        }
    }
}