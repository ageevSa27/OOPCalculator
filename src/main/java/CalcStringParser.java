import Operations.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CalcStringParser {
    public static Operation parse(String request) {
        double value1 = 0, value2 = 0;
        String operation;

// убираем пробелы
        request = request.trim();


        try {
            //распарсим String  в double
            String[] mas = request.split("[+\\-\\/*]");
            value1 = Double.parseDouble(mas[0]);
            value2 = Double.parseDouble(mas[1]);


        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Невозможно корректно распарсить строку. Возможно вы ввели что-то не так");
            e.printStackTrace();
            throw e;
        }
//определим операцию
        Matcher m = Pattern.compile("[+\\-\\/*]").matcher(request);

        if (m.find()) {
            operation = m.group(0);
            if ("+".equals(operation)) {
                return new SumOperation(value1, value2);
            } else if ("-".equals(operation)) {
                return new MinusOperation(value1, value2);
            } else if ("/".equals(operation)) {
                return new DivideOperation(value1, value2);
            } else if ("*".equals(operation)) {
                return new MultiplyOperation(value1, value2);
            }
        }
        System.out.println("Операция отсутствует");
        return null;
    }
}