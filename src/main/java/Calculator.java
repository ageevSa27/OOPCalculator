import java.util.Scanner;

public class Calculator {
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        System.out.println(CalcStringParser.parse(value).operate());

    }
}
