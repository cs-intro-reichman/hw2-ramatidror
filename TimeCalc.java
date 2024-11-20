public class TimeCalc {
    public static void main (String [] args) {

        String originalTime = args [0];
        int hoursInput = Integer.parseInt ("" + args [0].charAt (0) + args [0].charAt (1) );
        int minutesInput = Integer.parseInt ("" + args [0].charAt (3) + args [0].charAt (4) );
        int addedMinutes = Integer.parseInt (args [1] );
        int totalMinutes = minutesInput + addedMinutes;
        int totalHours =  (hoursInput + totalMinutes / 60);
        int newHours = (totalHours % 24) ;
        int newMinutes = totalMinutes % 60;


        if (newHours < 10 && newMinutes < 10 ) {
            System.out.println ("0" + newHours + ":" + "0" + newMinutes);
        }
        else if (newHours < 10 && newMinutes > 9 ) {
            System.out.println ("0" + newHours + ":" + newMinutes);
        }
        else if (newHours > 9 && newMinutes < 10 ) {
            System.out.println (newHours + ":" + "0" + newMinutes);
        }
        else {
            System.out.println (newHours + ":" + newMinutes);
        }


    }
}
