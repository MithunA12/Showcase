package Unit4.PigLatinLab;

import java.util.Locale;

public class PigLatin {

    /**
     *
     * This function checks to see if the word at index i is a consonant
     * @param str this is the input word
     * @param i this is the index of which the function checks to see if it's a consonant
     * @return it returns a boolean based on whether or not it's a consonant
     */
    public static boolean startsWithAConsonant(String str, int i){
        String consonants= "b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y, z";
        //It checks if str at that specific index is a consonant
        if (consonants.contains(str.substring(i, i + 1))){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * This function translates a word into pig latin
     * @param input this is the input string (word)
     * @return this function returns the translated word
     */
    public static String translateWordToPigLatin(String input){
        //This initializes all the needed variables for the while loop
        int i = 0;
        boolean hasConsonant = startsWithAConsonant(input, 0);
        String consonant = "";
        int index = 0;
        String output = "";
        //This while loop checks to see if the current letter in the word is a consonant
        //If it is, then it adds it to the consonant cluster string, and updates
        // the index accordingly
        while (hasConsonant){
            consonant += input.substring(i, i + 1);

            index = consonant.length();
            i++;
            hasConsonant = startsWithAConsonant(input, i);

        }
        //This sets output according to the pig latin rules for consonants and y's
        if(startsWithAConsonant(input, 0)){

            output = input.substring(index) + consonant + "ay";
            output.substring(0,1).toUpperCase();


        }
        //This sets output according to the pig latin vowel rules
        else{
            output = input + "yay";
        }
        return output;
    }

    /**
     *
     * @param str is the entire sentence itself before it gets converted to pig latin
     * @return it returns the entire sentence translated into Pig Latin, with
     * the first letter of the sentence capitalized
     */
    public static String toPigLatin(String str){
        String phrase = str.toLowerCase();
        String output = "";
        //This creates a for loop to convert each individual word into pig latin by splitting
        // each word in a sentence
        for (String word : phrase.split(" ")){

//            String temp = i;

//            for (int k = temp.length() - 1; k >= 0;k--){
//                output += temp.charAt(k);
//
//            }
            output += translateWordToPigLatin(word);
            output += " ";

        }
        //This makes the first letter of the sentence capitalized
        output = output.substring(0, 1).toUpperCase() + output.substring(1,output.length() - 1);

        return output;
    }

}
