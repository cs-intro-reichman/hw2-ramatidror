public class Collatz {
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        String verboseOrConcise = args[1];

        if (verboseOrConcise.equals ("v")) {

            for (int i = 1; i <= N; i++) {
                executeCollatz(i);
                System.out.println();

            }
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

        } else {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }


        public static void executeCollatz (int N) {
        int stepCount = 1;
            System.out.print(N + " ");

            while (N != 1) {
                if (N % 2 == 0) {
                    N = N / 2;
                    System.out.print(N + " ");
                } else {
                    N = (N * 3) + 1;
                    System.out.print(N + " ");
                }
                stepCount ++;
            }
            System.out.print ("(" + stepCount + ")" );

        }
}
