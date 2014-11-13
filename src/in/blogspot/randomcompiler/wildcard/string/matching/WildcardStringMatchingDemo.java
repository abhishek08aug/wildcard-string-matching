package in.blogspot.randomcompiler.wildcard.string.matching;

public class WildcardStringMatchingDemo {

    public static void main(String[] args) {
        System.out.println(WildcardStringMatching.wildcardStringMatching("abhishek", "a?hi*k"));
        System.out.println(WildcardStringMatching.wildcardStringMatching("welcome", "*"));
        System.out.println(WildcardStringMatching.wildcardStringMatching("hello", "*?"));
        System.out.println(WildcardStringMatching.wildcardStringMatching("hello", "*?*"));
        System.out.println(WildcardStringMatching.wildcardStringMatching("hello", "*************************???"));
        
        System.out.println(WildcardStringMatching.wildcardStringMatching("geeks", "g*ks")); // Yes
        System.out.println(WildcardStringMatching.wildcardStringMatching("geeksforgeeks", "ge?ks*")); // Yes
        System.out.println(WildcardStringMatching.wildcardStringMatching("gee", "g*k"));  // No because 'k' is not in second
        System.out.println(WildcardStringMatching.wildcardStringMatching("pqrst", "*pqrs")); // No because 't' is not in first
        System.out.println(WildcardStringMatching.wildcardStringMatching("abcdhghgbcd", "abc*bcd")); // Yes
        System.out.println(WildcardStringMatching.wildcardStringMatching("abcd", "abc*c?d")); // No because second must have 2 instances of 'c'
        System.out.println(WildcardStringMatching.wildcardStringMatching("abcd", "*c*d")); // Yes
        System.out.println(WildcardStringMatching.wildcardStringMatching("abcd", "*?c*d")); // Yes
    }

}
