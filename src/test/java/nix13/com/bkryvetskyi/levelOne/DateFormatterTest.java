package nix13.com.bkryvetskyi.levelOne;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {


    @Test
    void isValidTest() {

        IDateValid valid = new DateFormatter();

        String oldDate = "12/04/2020";
        String oldDate2 = "12 квітень 2020";

        String expected = valid.isValid(oldDate);
        String expectedFalse = valid.isValid(oldDate2);
        String actual = "20200412";

        assertEquals(expected, actual);
        assertFalse(false, expectedFalse);

    }

    @Test
    void Appication() {

        IDateValid valid = new DateFormatter();

        List<String> date = new ArrayList<>();
        date.add("11/11/2020");
        date.add("2020/12/20");
        date.add("03-11-2020");

        for (String newStr : date) {
            valid.isValid(newStr);
        }
        assertEquals(3, date.size());
    }
}