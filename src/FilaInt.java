import java.util.Scanner;

public class FilaInt {
    final int N = 3;
    int[] queue = new int[N];
    int head, tail, index;

    public void init() {
        index = tail = 0;
    }

    public boolean isEmpty() {
        return (index == 0);
    }

    public boolean isFull() {
        return (index == N);
    }

    public void enqueue(int elem) {
        if (isFull()) {
            System.out.println("[FULL QUEUE]");
        } else {
            queue[tail] = elem;
            index++;
//            tail++;

//            if (tail == N) {
//                tail = 0;
//            }
            tail = (tail + 1) % N;
        }
    }

    public int dequeue() {
        int elem = queue[head];
        index--;
//        if (head == N) {
//            head = 0;
//        }
        head = (head - 1) % N;
        return elem;
    }
}

