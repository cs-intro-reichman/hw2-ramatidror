public class Cheers {
    public static void main(String[] args) {

        String name = (args[0]).toUpperCase();
        int nameLength = name.length();
        int numberOfCheers = Integer.parseInt(args[1]);
        String vowels = "AEFHILMNORSX";

        for (int i = 0; i < nameLength; i++) {

            if (vowels.indexOf(name.charAt(i)) != (-1)) {
                System.out.println ("Give me an " + name.charAt(i) + ": " + name.charAt(i) + "!");
            } else {
                System.out.println("Give me a " + name.charAt(i) + ": " + name.charAt(i) + "!");
            }
        }

        System.out.println("What does that spell?");

        for (int n= 0; n < numberOfCheers; n++) {
            System.out.println(name + "!!!");
        }

    }
}













