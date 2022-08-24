package nix13.com.bkryvetskyi.levelTwo;

import java.util.*;

public class FindUniqueName {

    private static String firstUniqueName(List<String> listName) {
        Set<String> input = new LinkedHashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String name : listName) {
            if (!input.add(name)){
                duplicates.add(name);
            }
        }
        input.removeAll(duplicates);
        return input.isEmpty() ? null : input.iterator().next();
    }

    public static void main(String[] args) {
        List<String> listName = Arrays
                .asList("Lex", "Bob", "Lola", "Lex", "Sarah", "Bob", "Lola");

        System.out.println(firstUniqueName(listName));
    }
}
