package nix13.com.bkryvetskyi.levelTwo;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindUniqueNameTest {

    @Test
    void checkFindUniqueName() {

        List<String> listName = new ArrayList<>();
        listName.add("Alex");
        listName.add("Bob");
        listName.add("Alex");
        listName.add("Lex");

        String expected  = FindUniqueName.firstUniqueName(listName);
        String actual = "Bob";

        assertEquals(expected, actual);
    }
}