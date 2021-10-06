package main.java;

import java.util.Scanner;

public class Texts {

    public static void main(String[] args) {
        //DEMO

        Scanner myScan = new Scanner (System.in);
        char c1 = myScan.nextLine().charAt(0);
        System.out.println("Please enter a single character");
    }

    //Check the number of characters
    public static String text(String myText) {
        if (myText.length() > 500) {
            return "Error message";
        }else{
            return myText;
        }
    }

    //Replace a specific char with another one
    public static String replace(String original, char OldWord , char NewWord){
        String example = original.replace(OldWord, NewWord);
        return example;
    }

    //Replace a specific char with another one, all occurrences must be changed
    public static String replace2(){
        String str1 = "Hello Lorld, how are you??";
        StringBuilder result = new StringBuilder(str1) ;
        String str2 = str1.replaceAll('L', 'w');
        return str2.toString();
    }

    //Method to replace a phrase with a new phrase
    public static String myPhrase(String origin, String replaceWithPhrase) {
        StringBuilder result;
        int index = origin.indexOf(origin);
        result = new StringBuilder(origin);
        result.replace(index, index + origin.length, replaceWithPhrase);
        return result.toString();
    }

    //Method to replace a phrase with new phrase  all occurrences should be replaced
    public static String myPhrase2(String origin, String replaceWithPhrase) {


    }

