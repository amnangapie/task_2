package ua.nure.sorokina;

public class Formatter {
    private static char[] vowels = {'a', 'o', 'u', 'e', 'i'};

    private static boolean isVowel(char ch) {
        boolean isVowel = false;
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == ch) {
                isVowel = true;
                break;
            }
        }
        return isVowel;
    }

    public static String encloseVowel(String str) {
        if (str.length() == 1) {
            return str;
        } else if (isVowel(str.charAt(0)) || isVowel(str.charAt(1))) {
            return str.charAt(0) + "*" + encloseVowel(str.substring(1));
        } else {
            return str.charAt(0) + encloseVowel(str.substring(1));
        }
    }
}
