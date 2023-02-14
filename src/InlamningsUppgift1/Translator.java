package InlamningsUppgift1;

import java.util.HashMap;

public class Translator {
    private HashMap<String, Character> morseLetters = new HashMap<>();
    private HashMap<Character, String> engLetters = new HashMap<>();

    private String morse;
    private String english;

    public Translator() {
        morseLetters.put(".-", 'A');
        morseLetters.put("-...", 'B');
        morseLetters.put("-.-.", 'C');
        morseLetters.put("-..", 'D');
        morseLetters.put(".", 'E');
        morseLetters.put("..-.", 'F');
        morseLetters.put("--.", 'G');
        morseLetters.put("....", 'H');
        morseLetters.put("..", 'I');
        morseLetters.put(".---", 'J');
        morseLetters.put("-.-", 'K');
        morseLetters.put(".-..", 'L');
        morseLetters.put("--", 'M');
        morseLetters.put("-.", 'N');
        morseLetters.put("---", 'O');
        morseLetters.put(".--.", 'P');
        morseLetters.put("--.-", 'Q');
        morseLetters.put(".-.", 'R');
        morseLetters.put("...", 'S');
        morseLetters.put("-", 'T');
        morseLetters.put("..-", 'U');
        morseLetters.put("...-", 'V');
        morseLetters.put(".--", 'W');
        morseLetters.put("-..-", 'X');
        morseLetters.put("-.--", 'Y');
        morseLetters.put("--..", 'Z');
        morseLetters.put(".----", '1');
        morseLetters.put("..---", '2');
        morseLetters.put("...--", '3');
        morseLetters.put("....-", '4');
        morseLetters.put(".....", '5');
        morseLetters.put("-....", '6');
        morseLetters.put("--...", '7');
        morseLetters.put("---..", '8');
        morseLetters.put("----.", '9');
        morseLetters.put("-----", '0');
        morseLetters.put(".-.-.-", '.');
        morseLetters.put("--..--", ',');
        morseLetters.put("..--..", '?');
        morseLetters.put("-.-.--", '!');
        morseLetters.put(" / ", '/'); // space
        morseLetters.put(" ", ' '); // space

        engLetters.put('A', ".-");
        engLetters.put('B', "-...");
        engLetters.put('C', "-.-.");
        engLetters.put('D', "-..");
        engLetters.put('E', ".");
        engLetters.put('F', "..-.");
        engLetters.put('G', "--.");
        engLetters.put('H', "....");
        engLetters.put('I', "..");
        engLetters.put('J', ".---");
        engLetters.put('K', "-.-");
        engLetters.put('L', ".-..");
        engLetters.put('M', "--");
        engLetters.put('N', "-.");
        engLetters.put('O', "---");
        engLetters.put('P', ".--.");
        engLetters.put('Q', "--.-");
        engLetters.put('R', ".-.");
        engLetters.put('S', "...");
        engLetters.put('T', "-");
        engLetters.put('U', "..-");
        engLetters.put('V', "...-");
        engLetters.put('W', ".--");
        engLetters.put('X', "-..-");
        engLetters.put('Y', "-.--");
        engLetters.put('Z', "--..");
        engLetters.put('1', ".----");
        engLetters.put('2', "..---");
        engLetters.put('3', "...--");
        engLetters.put('4', "....-");
        engLetters.put('5', ".....");
        engLetters.put('6', "-....");
        engLetters.put('7', "--...");
        engLetters.put('8', "---..");
        engLetters.put('9', "----.");
        engLetters.put('0', "-----");
        engLetters.put('.', ".-.-.-");
        engLetters.put(',', "--..--");
        engLetters.put('?', "..--..");
        engLetters.put('!', "-.-.--");
        engLetters.put(' ', "/"); // mellanslag mellan bokstäver


        morse = "";
        english = "";
    }

    public void engToMorse(String inputEnglish) {
        char[] engArray = inputEnglish.toUpperCase().toCharArray();
                     morse = "";
                    for (int i = 0; i < engArray.length; i++) {
                        char ch = engArray[i];
                        morse += engLetters.get(ch);
                        //Space mellan morse code när skrivs ut***
                       if (i != engArray.length - 1) {
                            morse += " ";
                        }

                    }
    }

    public String getMorseResultat() {
        return morse;
    }

    public void morseToEnglish(String inputMorse) {
        String [] morseArray = inputMorse.split(" ");
         english = "";
        for (String morseLetter : morseArray) {
            Character letter = morseLetters.get(morseLetter);
            english += letter != null ? letter : " / "; //ta bort null för mellanslag och tilläger mellanslag
        }



    }

    public String getEnglishResultat() {
        return english;
    }
}

