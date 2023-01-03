package Unit4.PigLatinLab;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class PigLatinJUnitTest {

    @Before
    public void runBeforeEachTest() {
        //
    }


    @After
    public void runAfterEachTest() {
        //
    }


    // this method tests the translation of a single word, "cat", which starts with a consonant
    @Test
    public void translateConsonantWord1() {
        String word = "cat";
        String actual = PigLatin.translateWordToPigLatin(word);
        String expected = "atcay";
        assertEquals(expected, actual);
    }


    // this method tests the translation of a single word, "Black", who's first two letters are consonants
    @Test
    public void translateConsonantWord2() {
        String word = "black";
        String actual = PigLatin.translateWordToPigLatin(word);
        String expected = "ackblay";
        assertEquals(expected, actual);
    }


    // this method tests the translation of a single word, "oval", which starts with a vowel
    @Test
    public void translateVowelWord1() {
        String word = "oval";
        String actual = PigLatin.translateWordToPigLatin(word);
        String expected = "ovalyay";
        assertEquals(expected, actual);
    }


    // this method tests the translation of a single word, "apple", which starts with a vowel
    @Test
    public void translateVowelWord2() {
        String word = "apple";
        String actual = PigLatin.translateWordToPigLatin(word);
        String expected = "appleyay";
        assertEquals(expected, actual);
    }


    // this method tests the translation of a single word, "yellow", which starts with the letter "y"
    @Test
    public void translateStartWithYVowel() {
        String word = "yellow";
        String actual = PigLatin.translateWordToPigLatin(word);
        String expected = "ellowyay";
        assertEquals(expected, actual);
    }


    // this method tests the translation of an entire phrase using the toPigLatin() method
    @Test
    public void translatePhrase1() {
        String word = "The black cat ate a red apple";
        String actual = PigLatin.toPigLatin(word);
        String expected = "Ethay ackblay atcay ateyay ayay edray appleyay";
        assertEquals(expected, actual);
    }


    // this method tests the translation of an entire phrase using the toPigLatin() method
    @Test
    public void translatePhrase2() {
        String word = "Writing college essays is driving me crazy";
        String actual = PigLatin.toPigLatin(word);
        String expected = "Itingwray ollegecay essaysyay isyay ivingdray emay azycray";
        assertEquals(expected, actual);
    }


    // this method tests the translation of an entire phrase using the toPigLatin() method
    @Test
    public void translatePhrase3() {
        String word = "Everyone loves to code in Java";
        String actual = PigLatin.toPigLatin(word);
        String expected = "Everyoneyay oveslay otay odecay inyay avajay";
        assertEquals(expected, actual);
    }


}
