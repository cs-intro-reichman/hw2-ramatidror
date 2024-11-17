public class CalcPi {
    public static void main (String [] args) {

        int timesToExecute = Integer.parseInt (args [0]);
        int denominator = 3;
        double tempPi = 1.0;

        for (int i = 0; i < timesToExecute; i ++, denominator += 2) {

            if (i % 2 == 0 ) {
                tempPi = tempPi - (1.0/ denominator);
            }
            else {
                tempPi = tempPi + (1.0/ denominator);
            }
        }

        double approxPi = (tempPi  * 4 );

        System.out.println ("pi according to Java: " + Math.PI);
        System.out.println ("pi, approximated:     " + approxPi);
    }
}
