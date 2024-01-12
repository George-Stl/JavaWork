package Project;

import java.util.Scanner;
public class MyInteger {
    private int value;
    public MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public boolean isEven(){
        return value % 2 == 0;
    }
    public static boolean isEven(MyInteger value1){
        return isEven(value1.getValue());
    }
    public boolean isOdd(){
        return value % 2 != 0;
    }
    public static boolean isOdd(MyInteger value1){
        return isOdd(value1.getValue());
    }
    public boolean isPrime(){
        int k = 0;
        for(int i = 1; i < value; i++){
            if(value % i == 0)
                k++;
        }
        return (k == 2);
    }
    public static boolean isPrime(MyInteger value){
        return isPrime(value.getValue());
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 != 0;
    }
    public static boolean isPrime(int value){
        int k = 0;
        for(int i = 1; i <= value; i++){
            if(value % i == 0)
                k++;
        }
        return (k == 2);
    }
    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger value1){
        return equals(value1.getValue());
    }
    public static int parseInt(char[] list){
        String k= "";
        for (int i = 0; i < list.length; i++){
            k += String.valueOf(list[i]);
        }

        return Integer.parseInt(k);
    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        MyInteger integer = new MyInteger(14);
        System.out.println("Значение: " + integer.getValue() +
                "\nЧётное? "+ integer.isEven() +
                "\nНечетное? " + integer.isOdd() +
                "\nПростое? " +integer.isPrime());
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int value = input.nextInt();
        System.out.println("Значение " + value + "\nЧётное? " + MyInteger.isEven(value) +
                "\nНечётное? " + MyInteger.isOdd(value) +
                "\nПростое? " + MyInteger.isPrime(value));
        System.out.println("Значение " + value + " равно значению " +
                integer.getValue() + "?\n" + integer.equals(value));

        char[] listChar = new char[]{'1', '2', '3', '4', '5'};
        System.out.println("Преобразованный в число массив char[]: " + parseInt(listChar));
        String s = "654321";
        System.out.println("Преобразованная в число строка s: " + parseInt(s));

        MyInteger integer2 = new MyInteger(34);
        System.out.println("Методы для объекта:" + integer2.getValue() +
                "\nЧётное? " + MyInteger.isEven(integer2) +
                "\nНечетное? " + MyInteger.isOdd(integer2) +
                "\nПростое? " + MyInteger.isPrime(integer2) +
                "\nМетод equals для " + integer.getValue() + " и " +
                integer2.getValue() + " : " + integer.equals(integer2));

    }
}

