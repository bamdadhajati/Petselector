//Bamdad Hajati
// period 4 AP JAVAA
//it teels you what pet you should get depending on what is your name fav color and fav season

import java.util.Scanner;

public class Petselectorapjavaremake {

    public static void main(String[] args) {
        Scanner petselect = new Scanner(System.in);

        System.out.println("enter your name");
        String userName = petselect.nextLine().trim();

        System.out.println("enter your favorite color (Either red, blue or green)");
        String color = petselect.nextLine().trim().toLowerCase();

        System.out.println("enter your favorite season (winter, spring, summer, fall)");
        String season = petselect.nextLine().trim().toLowerCase();

        String first = "";
        if (userName.length() > 0) {
            first = userName.substring(0, 1).toLowerCase();
        }

        boolean letter = false;
        if (first.length() > 0 && "abcdefghijklmnopqrstuvwxyz".indexOf(first) >= 0) {
            letter = true;
        }
        boolean vowel = "aeiou".indexOf(first) >= 0;

        boolean validColor = color.equals("red") || color.equals("blue") || color.equals("green");
        boolean seasons = season.equals("winter") || season.equals("spring") || season.equals("summer") || season.equals("fall");

        String pet = "Pet Rock";
        if (!(letter && validColor && seasons)) {
            pet = "nothing (invalid input, try again)";
        }
        else if (color.equals("blue") && season.equals("fall")) {
            pet = "Alligator";
        }
        else if (color.equals("blue") && season.equals("spring")) {
            pet = "Ostrich";
        }
        else if (color.equals("green") && !vowel && season.equals("winter")) {
            pet = "Giraffe";
        }
        else if (color.equals("green") && !season.equals("fall")) {
            pet = "Dog";
        }
        else if (color.equals("red") && vowel) {
            pet = "Porcupine";
        }
        else if (color.equals("red")) {
            pet = "Panda";
        }
        else if (season.equals("summer")) {
            pet = "Pony";
        }
        else if (color.equals("blue") && !vowel && season.equals("winter")) {
            pet = "Axolotl";
        }

        System.out.println("your perfect pet is " + pet);

        petselect.close();
    }
}
