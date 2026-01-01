public class LifeLoading {
    public static void main(String[] args) throws Exception {

        load("Loading hopes");
        load("Loading courage");
        load("Loading consistency");

        System.out.println("\nWELCOME TO 2025");
    }

    static void load(String text) throws Exception {
        int total = 20;

        for (int percent = 0; percent <= 100; percent += 5) {
            int filled = (percent * total) / 100;

            System.out.print("\r" + text + " ");

            System.out.print("[");
            for (int i = 0; i < filled; i++) System.out.print("#");
            for (int i = filled; i < total; i++) System.out.print("-");
            System.out.print("] " + percent + "%");

            Thread.sleep(120);
        }
        System.out.println();
    }
}
