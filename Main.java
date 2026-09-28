public class Main {

    public static void main(String[] args) {

        try {

            System.out.println("=== RACER THREAD ===");

            RacerThread[] impares = new RacerThread[5];
            RacerThread[] pares = new RacerThread[5];

            int pos = 0;

            for (int i = 1; i <= 10; i += 2) {
                impares[pos] = new RacerThread(i);
                impares[pos].start();
                pos++;
            }

            for (RacerThread racer : impares) {
                racer.join();
            }

            System.out.println("=== ÍMPARES THREAD TERMINARAM ===");

            pos = 0;

            for (int i = 2; i <= 10; i += 2) {
                pares[pos] = new RacerThread(i);
                pares[pos].start();
                pos++;
            }

            for (RacerThread racer : pares) {
                racer.join();
            }

            System.out.println("=== RACER RUNNABLE ===");

            Thread[] imparesRunnable = new Thread[5];
            Thread[] paresRunnable = new Thread[5];

            pos = 0;

            for (int i = 1; i <= 10; i += 2) {

                RacerRunnable racer =
                    new RacerRunnable(i);

                imparesRunnable[pos] =
                    new Thread(racer);

                imparesRunnable[pos].start();

                pos++;
            }

            for (Thread thread : imparesRunnable) {
                thread.join();
            }

            System.out.println("=== ÍMPARES RUNNABLE TERMINARAM ===");

            pos = 0;

            for (int i = 2; i <= 10; i += 2) {

                RacerRunnable racer =
                    new RacerRunnable(i);

                paresRunnable[pos] =
                    new Thread(racer);

                paresRunnable[pos].start();

                pos++;
            }

            for (Thread thread : paresRunnable) {
                thread.join();
            }

            System.out.println("=== TODAS AS CORRIDAS TERMINARAM ===");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }