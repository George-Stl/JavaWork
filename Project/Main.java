package Project;

import java.util.Scanner;
public class Main {
    // final int DISCOUNT = 5;
    // final int NDS = 20;
    public static void main(String[] args) {
        
        int amount;
        String useNDS;
        double discount = 0.05;
        double nds = 0.2;
        double finalPrice = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите стоимость единицы товара: ");
        double price = input.nextDouble();
        System.out.println("Введенная цена товара" + price);
        System.out.print("Введите количество товаров товара: ");
        amount = input.nextInt();
        do{
            System.out.print("Учитывать ли налог на добавочную стоимость? (Да/Нет) ");
            useNDS = input.next();
        } while (!"Да".equalsIgnoreCase(useNDS) && !"Нет".equalsIgnoreCase(useNDS));

        if(amount > 10 && useNDS.equalsIgnoreCase("Да")){ //со скидкой, с НДС
            finalPrice = getPrice(price, amount, nds, discount);
        } else if (amount <= 10 && useNDS.equalsIgnoreCase("Да")){ //без скидки, но с НДС
            finalPrice = getPrice(price, nds, amount);
        } else if (amount > 10 && useNDS.equalsIgnoreCase("Нет")){ //со скидкой, без НДС
            finalPrice = getPrice(price, amount, discount);
        } else {
            finalPrice = getPrice(price, amount);
        }
        System.out.println("Общая стоимость " + amount + " шт. товара по заявленной цене составила: " + finalPrice + "." );
    }
    public static double getPrice(double price, int amount) { //метод без НДС и скидки
        double finalPrice = price* amount;
        finalPrice = Math.round(finalPrice * 100) / 100.0;
        return finalPrice;
    }
    public static double getPrice(double price, int amount, double discount){
        double finalPrice = price * amount * (1 - discount);
        finalPrice = Math.round(finalPrice * 100) / 100.0;
        return finalPrice;
    }
    public static double getPrice(double price, double nds, int amount) { //с учетом ндс но без скидки
        double finalPrice = price * amount * (1 - nds);
        finalPrice = Math.round(finalPrice * 100) / 100.0;
        return finalPrice;
    }
    public static double getPrice(double price, int amount, double nds, double discount) {
        double finalPrice = price * amount * (1 - nds) * (1 - discount);
        finalPrice = Math.round(finalPrice * 100) / 100.0;
        return finalPrice;
    }

    
}    

