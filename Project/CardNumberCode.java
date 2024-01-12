package Project;

import java.util.Scanner;

public class CardNumberCode {
    
  public static void main(String[] args) {
    System.out.println("Введите номер, который хотите скрыть: ");
    Scanner input = new Scanner(System.in);
    String cardNumber = input.nextLine().replaceAll("\\s+", "");
    
    System.out.println("Ваш номер: " + code(cardNumber));
    
  }
  public static String code(String cardNumber){
    return code(cardNumber, cardNumber.length(), "", 1);
    
  }
  
  private static String code(String cardNumber, int index, String result, int i){
    if (index <= 4)
        return result + cardNumber;
    else 
        return code(cardNumber.substring(i), index - 1, result + "*", i++);

  }
  
}

