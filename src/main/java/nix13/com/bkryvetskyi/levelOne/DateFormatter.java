package nix13.com.bkryvetskyi.levelOne;


import java.time.LocalDate;
import java.time.format.*;
import java.util.ArrayList;
import java.util.List;

public class DateFormatter implements IDateValid {

    private static final DateTimeFormatter formatterBuilder =
            new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ofPattern("yyyy/MM/dd"))
            .appendOptional(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            .appendOptional(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
            .toFormatter();

    private static final DateTimeFormatter newPattern = DateTimeFormatter
            .BASIC_ISO_DATE;


    @Override
    public String isValid(String str) {

        try {
            formatterBuilder.parse(str);
            return (LocalDate.parse(str, formatterBuilder)
                    .format(newPattern));
        } catch (DateTimeParseException ex) {
            return "Date don't valid -> " + str;
        }
    }

    public static void main(String[] args) {

        IDateValid formatter = new DateFormatter();

        List<String> listDate = new ArrayList<>();
        listDate.add("05/04/2021");
        listDate.add("2022/04/01");
        listDate.add("04-05-2022");
        listDate.add("5 квітня 2022");

        for (String str : listDate) {
            System.out.println(formatter.isValid(str));
        }
    }
}
