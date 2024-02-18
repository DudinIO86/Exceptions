import java.io.IOException;
import java.util.Scanner;

public class Run {
    public static void run() throws IOException {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Введите данные через пробел: Фамилия Имя Отчество дата рождения номер телефона пол\n\n" +
                "Форматы данных:\n" +
                "\n" +
                "фамилия, имя, отчество - строки\n" +
                "дата _ рождения - строка формата dd.mm.yyyy\n" +
                "номер _ телефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m.");
        String input=scanner.nextLine();
//        System.out.println(input);

        String[] str=new String[6];
        str=input.split(" ");
        Validation.valid(str);
        Recovery.rec(input,str[0]);
    }
}
