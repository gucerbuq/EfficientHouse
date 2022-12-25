package programmingprojects.unit1;

public class Q3 {
    public static void main(String[] args) {

        String first = "gucerbuq";
        String last = "yalcin";

        first = first.substring(1, 2).toUpperCase() + first.substring(2) + first.substring(0, 1) + "ay";
        last = last.substring(1, 2).toUpperCase() + last.substring(2) + last.substring(0, 1) + "ay";
        String pigLatinName = first + " " + last;

        System.out.println("The name in pig latin is " + pigLatinName + ".");

    }
}
