import java.util.Scanner;

//Программа запрашивает шестизначное число, после ввода определяет будет ли являтся
//счастливым билет с таким номером (сумма первых трех цифр совпадает с сумой трех последних).
//Пример входных данных: 421151; 954832
//Вывод: Да; Нет
public class Main {
    public static void main(String[] args) {
        System.out.print("Введіть шестизначне число:\t");
        Scanner scanner = new Scanner(System.in);
        String numberStr = scanner.nextLine();
        char[] numbers = numberStr.toCharArray();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numbers.length/2; i++) {
            sum1 += Integer.parseInt(String.valueOf(numbers[i]));
            sum2 += Integer.parseInt(String.valueOf(numbers[i + numbers.length/2]));
        }
        System.out.print(sum1 == sum2?"\tЩасливе число":"\tЧисло не є щасливим");
    }
}