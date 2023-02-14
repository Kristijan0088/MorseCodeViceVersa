package InlamningsUppgift1;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;

public class TDDmorseEng {


    @Test
    public void TestEngToMorse1() {
        //Ett ord from engelska språk till morse code
        Translator test = new Translator();


        String expected = ".... --- .-. ... .";

        test.engToMorse("Horse");

        String actual = test.getMorseResultat();

        assertEquals(expected, actual);


    }

    @Test
    public void TestEngToMorse2() {
        //Flera ord med dubbel mellanslag efter varandra
        Translator test = new Translator();

        String expected = ".... --- .-. ... . ... / .- .-. . / ..-. .-. .. . -. -.. .-.. -.-- / .- -. .. -- .- .-.. ...";

        test.engToMorse("Horses are friendly animals");

        String actual = test.getMorseResultat();

        assertEquals(expected, actual);
    }

    @Test
    public void TestMorseToEng1() {
        //Ett Morse code till engelska språk

        Translator test = new Translator();

        String expected = "TIGER";

        test.morseToEnglish("- .. --. . .-.");

        String actual = test.getEnglishResultat();

        assertEquals(expected, actual);

    }

    @Test
    public void TestMorseToEng2() {
        //Flera Morse code till engelska språk

        Translator test = new Translator();

        String expected = "THE / GREAT / WHITE / MOON";

        test.morseToEnglish("- .... .  --. .-. . .- -  .-- .... .. - .  -- --- --- -.");

        String actual = test.getEnglishResultat();

        assertEquals(expected, actual);
    }
    @Test
    public void TestMorseToEng3() {
        //Mellanslag Morse code till engelska språk

        Translator test = new Translator();

        String expected = "A / A";

        test.morseToEnglish(".- / .-");//dubbel mellanslag

        String actual = test.getEnglishResultat();

        assertEquals(expected, actual);

    }
}

