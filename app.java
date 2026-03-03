public class OOPSBannerApp {
    
    static class CharacterPattern {
        private char character;
        private String[] pattern;
        
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        
        public char getCharacter() {
            return character;
        }
        
        public String[] getPattern() {
            return pattern;
        }
    }
    
    public static CharacterPattern[] createCharacterPatternMaps() {
        CharacterPattern[] charMaps = new CharacterPattern[4];
        
        String[] patternO = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
        charMaps[0] = new CharacterPattern('O', patternO);
        charMaps[1] = new CharacterPattern('O', patternO);
        
        String[] patternP = {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
        charMaps[2] = new CharacterPattern('P', patternP);
        
        String[] patternS = {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
        charMaps[3] = new CharacterPattern('S', patternS);
        
        return charMaps;
    }
    
    public static void printMessage(String message, CharacterPattern[] charMaps) {
        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < message.length(); i++) {
                char currentChar = message.charAt(i);
                for (CharacterPattern charMap : charMaps) {
                    if (charMap.getCharacter() == currentChar) {
                        System.out.print(charMap.getPattern()[row] + "  ");
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        CharacterPattern[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}