package ru.netology.vdokuchaev;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Виталий");
        int NumberTrans;
        boolean InOutTrans;
        float SumTrans ;
        String Naznach;
        String NamePayer;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер транзакции:");
        NumberTrans = scanner.nextInt();
        System.out.println("Введите сумму транзакции:");
        SumTrans = scanner.nextFloat();
        System.out.println("Введите плательщика:");
        NamePayer = scanner.next();
        System.out.println("Введите назначение транзакции:");
        Naznach = scanner.next();

        System.out.println("Номер транзакции: "+NumberTrans+", плательщик: "+NamePayer+", сумма: "+SumTrans+", назначение платежа: "+Naznach);


    }
}