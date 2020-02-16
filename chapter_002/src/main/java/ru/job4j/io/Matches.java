package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int amount = 11;
       System.out.println("Вы можете убрать со стола от одного до трех спичек");
        while (amount > 0) {
           System.out.println("Количество оставшихся спичек на столе: " + amount + ". Введите число: ");
           int take = input.nextInt();
           if (take < 1 || take > 3) {
               System.out.println("Выберите число от одного до трех.");
           } else {
               amount = amount - take;
           }
           if (amount == 0) {
               System.out.println("Вы пориграли.");
               break;
           }
       }
    }
}

