public class RacerThread extends Thread {

    private int id;

    public RacerThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 1000; i++) {
            System.out.println(
                "RacerThread " + id +
                " - imprimindo " + i
            );
        }

        System.out.println("RacerThread " + id + " terminou!");
    }
}