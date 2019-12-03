import java.util.HashMap;
import java.util.Map;

public class MorseMain {

    public static void main(String[] args) {

       System.out.println(( lettersToMorseCode("hi there")));
       String morse = morseCodeToLetters("....") ;

        System.out.println(morse);
    }

    public static String lettersToMorseCode(String plainText)
    {
        plainText.toLowerCase();

        StringBuilder translatedText = new StringBuilder();
        char[] splitPlainText = plainText.toCharArray();
        Map<String,Character> morseCode = mappingMorseCode();

        for(char letter: splitPlainText){
            for(Map.Entry<String, Character> entry: morseCode.entrySet()){
                if(entry.getValue().equals(letter))
                    translatedText.append(entry.getKey() + " ") ;
            }
        }

        return  translatedText.toString();

    }




    public static String morseCodeToLetters( String morseCodeMessage)
    {
        StringBuilder translatedText = new StringBuilder();
        String[] splitMorseCode = morseCodeMessage.split(" ");

         Map<String,Character> morseCode = mappingMorseCode();

        for(String letter: splitMorseCode){
            for(Map.Entry<String, Character> entry: morseCode.entrySet()){
                if(entry.getKey().equals(letter))
                    translatedText.append(entry.getValue());
            }
        }

        return translatedText.toString();
    }
    public static Map<String,Character> mappingMorseCode(){
        Map<String,Character> morseCode = new HashMap<>();

        morseCode.put(".-", 'a');
        morseCode.put("-...", 'b');
        morseCode.put("-.-.", 'c');
        morseCode.put("-..", 'd');
        morseCode.put(".", 'e');
        morseCode.put("..-.", 'f');
        morseCode.put("--.", 'g');
        morseCode.put("....", 'h');
        morseCode.put("..", 'i');
        morseCode.put(".---", 'j');
        morseCode.put("-.-", 'k');
        morseCode.put(".-..", 'l');
        morseCode.put("--", 'm');
        morseCode.put("-.", 'n');
        morseCode.put("---", 'o');
        morseCode.put(".--.", 'p');
        morseCode.put("--.-", 'q');
        morseCode.put(".-.", 'r');
        morseCode.put("...", 's');
        morseCode.put("-", 't');
        morseCode.put("..-", 'u');
        morseCode.put("...", 'v');
        morseCode.put(".--", 'w');
        morseCode.put("-..-", 'x');
        morseCode.put("-.--", 'y');
        morseCode.put("--..", 'z');
        morseCode.put("/", ' ');

        return  morseCode;
    }
}
