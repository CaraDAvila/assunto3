package Filas;

public class FilaString {

        final int N = 3;
        String[] queue = new String[N];
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

        public void enqueue(String elem) {
            if (isFull()) {
                System.out.println("[FULL QUEUE]");
            } else {
                queue[tail] = elem;
                index++;

                tail = (tail + 1) % N;
            }
        }

        public String dequeue() {
            String elem = queue[head];
            index--;

            head = (head - 1) % N;
            return elem;
        }

        public String first () {

            return( queue[head]);
        }
    }



