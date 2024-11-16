public class TestRandom {
    public static void main(String[] args) {

        int timesToRun = Integer.parseInt(args[0]);
        int count = 0;
        int biggerThanHalf = 0;
        int halfAndSmaller = 0;
        double ratio = 0;

        for (int i = 0; i < timesToRun; i++) {
	    double random = Math.random();
            if (random > 0.5) {
                biggerThanHalf++;
            } else {
                halfAndSmaller++;
            }
        }

        if (biggerThanHalf < halfAndSmaller) {
            ratio = (double) biggerThanHalf / halfAndSmaller;
        } else if (biggerThanHalf > halfAndSmaller) {
           ratio = (double) halfAndSmaller / biggerThanHalf;
        }


        System.out.println("> 0.5: " + biggerThanHalf + " times");
        System.out.println("<= 0.5: " + halfAndSmaller + " times");
        System.out.println("Ratio: " + ratio);

    }
}
