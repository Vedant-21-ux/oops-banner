import java.util.HashMap;

public class OOPSBannerApp {
    
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < message.length(); i++) {
                char currentChar = message.charAt(i);
                String[] pattern = charMap.get(currentChar);
                System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }
    
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();
        
        String[] patternO = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
        charMap.put('O', patternO);
        
        String[] patternP = {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
        charMap.put('P', patternP);
        
        String[] patternS = {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
        charMap.put('S', patternS);
        
        return charMap;
    }
    
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}