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
        Customer customer = new Customer();
        Operation operation = new Operation();
        Operation[] operations =new Operation[5];
        Customer[] customers = new Customer[2];
        int[][] statement;
        //ДЗ1
        System.out.println("Виталий");
        // ДЗ2
        int numberTrans; // номер транзакции
        boolean InOutTrans; //направление транзакции
        float[] sumTrans = new float[5]; // сумма транзакции
        String[] naznach = new String[5]; // назначение
        String[] namePayer = new String[5]; // плательщик
        LocalDate [] dataTranz = new LocalDate[5]; // дата платежа
        StringBuilder sb= new StringBuilder();
        Scanner scanner = new Scanner(System.in);
    // ДЗ3 4, 5
        int i=0;
        outWhileClient:
        while (true){
            System.out.println("Вы хотете завести клиента? Введите \"да\" или \"нет\"");
            String input = scanner.next();
            switch (input) {
                case "нет":
                    break outWhileClient;
                case "да":
                    System.out.println("Введите клиента:");
                    customers[] = customer(scanner.next());

                    namePayer[i] = scanner.next();
                    Customer()
            }

        }

        i=0;
        outWhile:
        while (true){
            System.out.println("Вы хотете завести тарнзакцию? Введите \"да\" или \"нет\"");
            String input = scanner.next();
            switch (input) {
                case "нет" :
                    break outWhile;
                case "да":
                    System.out.println("Введите плательщика:");
                    namePayer[i] = scanner.next();

                    System.out.println("Введите сумму транзакции:");
                    operation.setSumTrans(scanner.nextFloat());
                    sumTrans[i] = operation.getSumTrans();
                    System.out.println("Введите назначение транзакции:");
                    naznach[i] = operation.setNaznach(scanner.next());
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