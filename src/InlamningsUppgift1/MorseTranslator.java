package InlamningsUppgift1;


import java.util.Scanner;

public class MorseTranslator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu = 0;


        boolean notDone = true;

        System.out.println("\n Welcome to Morse code translator to english and vice versa");

        while (notDone) {

            System.out.println("\n Press 1 to translate from English to Morse code ");
            System.out.println("\n Press 2 to translate from Morse code to English ");
            System.out.println("\n Press 3 to exit Morse translator program ");
            System.out.println(" ");

            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\n Enter only numbers 1 from 3. " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Wrong choice!" + e.getMessage());
            }

            switch (menu) {
                case 1:
                    System.out.println("\f Enter some english text: ");
                    String english = sc.nextLine();
                    Translator translator = new Translator();
                    translator.engToMorse(english);//method English to morse code

                    System.out.println("\f Morse code result: \n" + translator.getMorseResultat());//getMorseResult

                    //notDone = true;
                    break;
                case 2:
                    System.out.println("\f Enter some Morse code: ");
                    String morse = sc.nextLine();//gamal namn morseToEnglish
                    Translator translatorII = new Translator();
                    translatorII.morseToEnglish(morse);

                    System.out.println("\f English text result \n" + translatorII.getEnglishResultat());
                    //notDone = false;
                    break;

                case 3:
                    System.out.println("\n You have exited the program successfully.");
                    notDone = false;
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("\n Chose from 1 to 3 in menu bar");
                    notDone = true;

            }


        }
    }


}



/*         morse to english
for(int i = 0; i < array.length; i++) {
    String[] letters = array[i].split(" ");
    for (int j = 0; j < letters.length; j++) {
        String letter = letters[j];
        englishResult += morseLetters.get(letter);
    }
    if (i != array.length - 1) {
        englishResult += " ";
    }
}

 */

/*
 String[] array = morseToEnglish.split("[ \n]+");
                    String englishResult = " ";
                    morseLetters.put(" / ", ' ');
                    for (int i = 0; i < array.length; i++) {
                        String letter = array[i];
                        englishResult += morseLetters.get(letter);
                        if (i != array.length - 1) {
                            englishResult += " ";
                        }
                    }
 */
  /*
        for (int i = 0; i < morseArray.length;i++){
           String letter = morseArray[i];
           english += morseLetters.get(letter);
           //english = letter != null ? letter : "";
           if (i != morseArray.length - 1) {
              english +=  " ";
           }
        }*/
//var morseArray = morse.split(" ");
//var englishResult = " ";
                    /*
                    for (var morseLetter : morseArray) {
                      var letter = morseLetters.get(morseLetter);
                    englishResult += letter != null ? letter : "";
                    */