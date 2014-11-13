package in.blogspot.randomcompiler.wildcard.string.matching;

public class WildcardStringMatching {
    public static boolean wildcardStringMatching(String input, String pattern) {
        if(input == null && pattern == null) {
            return true;
        }
        if(input != null && pattern == null) {
            return false;
        }
        if(input == null) {
            boolean allAsterisks = true;
            for(int i=0; i<pattern.length(); i++) {
                if(pattern.charAt(i) != '*') {
                    return false;
                }
            }
            return true;
        }
        return wildcardStringMatchingInternal(input, pattern, 0, 0);
    }

    private static boolean wildcardStringMatchingInternal(String input, String pattern, int iIndex, int pIndex) {
        if(iIndex >= input.length() && pIndex >= pattern.length()) {
            return true;
        }
        if(iIndex >= input.length() && pattern.charAt(pIndex) != '*') {
            return false;
        }
        if(iIndex >= input.length() && pattern.charAt(pIndex) == '*') {
            return wildcardStringMatchingInternal(input, pattern, iIndex, pIndex+1);
        }
        if(iIndex < input.length() && pIndex >= pattern.length()) {
            return false;
        }
        if(input.charAt(iIndex) == pattern.charAt(pIndex)) {
            return wildcardStringMatchingInternal(input, pattern, iIndex+1, pIndex+1);
        }
        if(pattern.charAt(pIndex) == '?') {
            return wildcardStringMatchingInternal(input, pattern, iIndex+1, pIndex+1);
        }
        if(pattern.charAt(pIndex) == '*') {
            return wildcardStringMatchingInternal(input, pattern, iIndex+1, pIndex) || 
                    wildcardStringMatchingInternal(input, pattern, iIndex, pIndex+1);
        }
        return false;
    }
}
