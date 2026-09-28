public class RacerRunnable implements Runnable {

    private int id;

    public RacerRunnable(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 1000; i++) {
            System.out.println(
                "RacerRunnable " + id +
                " - imprimindo " + i
            );
        }

        System.out.println("RacerRunnable " + id + " terminou!");
    }
}