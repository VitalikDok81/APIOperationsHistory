package ru.netology.vdokuchaev;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //ДЗ1
        System.out.println("Виталий");
        // ДЗ2
        int numberTrans; // номер транзакции
        boolean InOutTrans; //направление транзакции
        float sumTrans ; // сумма транзакции
        String naznach; // назначение
        String namePayer; // плательщик
        LocalDate dataTranz; // дата платежа
        StringBuilder sb= new StringBuilder();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите номер транзакции:");
//        numberTrans = scanner.nextInt();
//        System.out.println("Введите сумму транзакции:");
//        sumTrans = scanner.nextFloat();
//        System.out.println("Введите плательщика:");
//        namePayer = scanner.next();
//        System.out.println("Введите назначение транзакции:");
//        naznach = scanner.next();
//        System.out.println("Введите дату транзакции в формате dd.MM.yyyy:");
//        String  dataStr = scanner.next().trim();
//        dataTranz=LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        //System.out.println("Номер транзакции: "+NumberTrans+", плательщик: "+NamePayer+", сумма: "+SumTrans+", назначение платежа: "+Naznach);
//        sb.append("Номер транзакции: ");
//        sb.append(numberTrans);
//        sb.append(", плательщик: ");
//        sb.append(namePayer);
//        sb.append(", назначение платежа: ");
//        sb.append(naznach);
//        sb.append(", сумма: ");
//        sb.append(sumTrans);
//        sb.append(", дату транзакции: ");
//        sb.append(dataTranz);
//        System.out.println(sb.toString());
    // ДЗ3
        outWhile:
        while (true){
            System.out.println("Вы хотете завести тарнзакцию? Введите \"да\" или \"нет\"");
            String input = scanner.next();
            switch (input) {
                case "нет" :
                    break outWhile;
                case "да":
                    System.out.println("Введите номер транзакции:");
                    numberTrans = scanner.nextInt();
                    sb.append("Номер транзакции: ");
                    sb.append(numberTrans);
                    System.out.println("Введите сумму транзакции:");
                    sumTrans = scanner.nextFloat();
                    sb.append(", сумма: ");
                    sb.append(sumTrans);
                    System.out.println("Введите плательщика:");
                    namePayer = scanner.next();
                    sb.append(", плательщик: ");
                    sb.append(namePayer);
                    System.out.println("Введите назначение транзакции:");
                    naznach = scanner.next();
                    sb.append(", назначение платежа: ");
                    sb.append(naznach);
                    System.out.println("Введите дату транзакции в формате dd.MM.yyyy:");
                    String  dataStr = scanner.next().trim();
                    dataTranz=LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                    sb.append(", дату транзакции: ");
                    sb.append(dataTranz);
                default:
                    System.out.println("Вы ввели невалидное значение");
//                    break;
            }
        System.out.println(sb.toString());
        }
        System.out.println("Пока");
    }
}