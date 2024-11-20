public class Cheers{
    public static void main(String[] args) {

        String name = (args[0]);
        int nameLength = name.length();
        int numberOfCheers = Integer.parseInt(args[1]);
        String upperCaseName = "";
        String vowels = "AEFHILMNORSX";

        for (int j = 0; j <nameLength; j ++) {
            char currentChar = name.charAt(j);
            if (name.charAt(j) == 'a' || name.charAt(j) == 'A') {
                currentChar = 'A';
            } else if (name.charAt(j) == 'b' || name.charAt(j) == 'B') {
                currentChar = 'B';
            } else if (name.charAt(j) == 'c' || name.charAt(j) == 'C') {
                currentChar = 'C';
            }else if (name.charAt(j) == 'd' || name.charAt(j) == 'D') {
                currentChar = 'D';
            }else if (name.charAt(j) == 'e' || name.charAt(j) == 'E') {
                currentChar = 'E';
            }else if (name.charAt(j) == 'f' || name.charAt(j) == 'F') {
                currentChar = 'F';
            } else if (name.charAt(j) == 'g' || name.charAt(j) == 'G') {
                currentChar = 'G';
            } else if (name.charAt(j) == 'h' || name.charAt(j) == 'H') {
                currentChar = 'H';
            }else if (name.charAt(j) == 'i' || name.charAt(j) == 'I') {
                currentChar = 'I';
            }else if (name.charAt(j) == 'j' || name.charAt(j) == 'J') {
                currentChar = 'J';
            }else if (name.charAt(j) == 'k' || name.charAt(j) == 'K') {
                currentChar = 'K';
            }else if (name.charAt(j) == 'l' || name.charAt(j) == 'L') {
                currentChar = 'L';
            } else if (name.charAt(j) == 'm' || name.charAt(j) == 'M') {
                currentChar = 'M';
            }else if (name.charAt(j) == 'n' || name.charAt(j) == 'N') {
                currentChar = 'N';
            }else if (name.charAt(j) == 'o' || name.charAt(j) == 'O') {
                currentChar = 'O';
            }else if (name.charAt(j) == 'p' || name.charAt(j) == 'P') {
                currentChar = 'P';
            } else if (name.charAt(j) == 'q' || name.charAt(j) == 'Q') {
                currentChar = 'Q';
            } else if (name.charAt(j) == 'r' || name.charAt(j) == 'R') {
                currentChar = 'R';
            }else if (name.charAt(j) == 's' || name.charAt(j) == 'S') {
                currentChar = 'S';
            }else if (name.charAt(j) == 't' || name.charAt(j) == 'T') {
                currentChar = 'T';
            }else if (name.charAt(j) == 'u' || name.charAt(j) == 'U') {
                currentChar = 'U';
            } else if (name.charAt(j) == 'v' || name.charAt(j) == 'V') {
                currentChar = 'V';
            }else if (name.charAt(j) == 'w' || name.charAt(j) == 'W') {
                currentChar = 'W';
            }else if (name.charAt(j) == 'x' || name.charAt(j) == 'X') {
                currentChar = 'X';
            }else if (name.charAt(j) == 'y' || name.charAt(j) == 'Y') {
                currentChar = 'Y';
            }else if (name.charAt(j) == 'z' || name.charAt(j) == 'Z') {
                currentChar = 'Z';
            }
            upperCaseName += currentChar;
        }

        for (int i = 0; i < nameLength; i++) {

            if (vowels.indexOf(upperCaseName.charAt(i)) != (-1)) {
                System.out.println ("Give me an " + upperCaseName.charAt(i) + ": " + upperCaseName.charAt(i) + "!");
            } else {
                System.out.println("Give me a  " + upperCaseName.charAt(i) + ": " + upperCaseName.charAt(i) + "!");
            }
        }

        System.out.println("What does that spell?");

        for (int n= 0; n < numberOfCheers; n++) {
            System.out.println(upperCaseName + "!!!");
        }

    }
}
