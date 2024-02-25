package ru.netology.vdokuchaev;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;

import static java.util.Objects.isNull;

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
        float[] sumTrans = new float[5]; // сумма транзакции
        String[] naznach = new String[5]; // назначение
        String[] namePayer = new String[5]; // плательщик
        LocalDate [] dataTranz = new LocalDate[5]; // дата платежа
//        dataTranz[1]=LocalDate.parse("01.01.1900", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        dataTranz[2]=LocalDate.parse("01.01.1900", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        dataTranz[3] = LocalDate.parse("01.01.1900", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        dataTranz[4] = LocalDate.parse("01.01.1900", DateTimeFormatter.ofPattern("dd.MM.yyyy"));

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
    // ДЗ3 и 4
        int i=0;
        outWhile:
        while (true){
            System.out.println("Вы хотете завести тарнзакцию? Введите \"да\" или \"нет\"");
            String input = scanner.next();
            switch (input) {
                case "нет" :
                    break outWhile;
                case "да":
                    System.out.println("Введите сумму транзакции:");
                    sumTrans[i] = scanner.nextFloat();
                    System.out.println("Введите плательщика:");
                    namePayer[i] = scanner.next();
                    System.out.println("Введите назначение транзакции:");
                    naznach[i] = scanner.next();
                    System.out.println("Введите дату транзакции в формате dd.MM.yyyy:");
                    String  dataStr = scanner.next().trim();
                    LocalDate d=LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                    dataTranz[i] = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                    i++;
                    break;
                default:
                    System.out.println("Вы ввели невалидное значение");
//                    break;
            }
        System.out.println(sb.toString());
        }
        int numberTransCount=0;
        while (dataTranz[numberTransCount] != null){
            numberTransCount++;
        }
        if (numberTransCount != 0) {
            System.out.println("введено " + numberTransCount + " транзакций.");
            LocalDate dataStart = LocalDate.parse("01.01.2024", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            LocalDate dataEnd = LocalDate.parse("01.03.2024", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            StringBuilder sb1= new StringBuilder();

//            for (LocalDate date : dataTranz){
            for (int i1=0; i1+1 <=numberTransCount;i1++){ //while (dataTranz[i1] != null){
                LocalDate date=dataTranz[i1];
                if (date.isAfter(dataStart) && date.isBefore(dataEnd)){
                    sb1.append("Номер транзакции: ");
                    sb1.append(i1+1);
                    sb1.append(", плательщик: ");
                    sb1.append(namePayer[i1]);
                    sb1.append(", назначение платежа: ");
                    sb1.append(naznach[i1]);
                    sb1.append(", сумма: ");
                    sb1.append(sumTrans[i1]);
                    sb1.append(", дату транзакции: ");
                    sb1.append(date);
                    System.out.println(sb1.toString());
                    sb1 = new StringBuilder();
                }
                //i1++;
            }
        } else System.out.println("Пока");
    }
}