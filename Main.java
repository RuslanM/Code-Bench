package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)    {
        Scanner scanner = new Scanner(System.in);
        String codeString = "Введите код операции: 1) Сложение, 2) Вычитание, 3) Умножение, 4) Деление";
        String numberString = "Введите первое число";
        String numberString2 = "Введите второе число число";
        String wrongOpperation = "Выбрана невозможная операция";
        System.out.println(codeString);
        int operation = scanner.nextInt();
        System.out.println(numberString);
        int firstNumber = scanner.nextInt();
        System.out.println(numberString2);
        int secondNumber = scanner.nextInt();
        if (operation == 1)
            System.out.println(firstNumber + secondNumber);
        if (operation == 2)
            System.out.println(firstNumber - secondNumber);
        if (operation == 3)
            System.out.println(firstNumber * secondNumber);
        if (operation == 4)
            System.out.println(firstNumber / secondNumber);
    }
    }