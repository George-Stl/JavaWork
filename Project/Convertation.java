package Project;

import java.util.Scanner;

public class Convertation {

  final static double ROUBLES_PER_YEN = 0.72;
  static double roubles;


  public static void instruction(){
    System.out.println("Вам будет предложено ввести количество конвертаций (введите четное число), " + 
    "после чего вводите количество валюты, которое необходимо конвертировать.");
  }
  
	public static void main(String[] args){

    	instruction();
      String userString;
	    int i = 0, j = 0, k = 0;
	    boolean contin = true;
    	
    	double japan_yen = 0.0;
    	
    
    	Scanner input = new Scanner(System.in);
      do{
        System.out.println("Сколько раз вы хотите произвести конвертацию валюты? (число больше нуля): ");
        k = input.nextInt();       
      } while (k <= 0);
      double[] list = new double[k];
    	do {
    	 System.out.print("Введите количество японских йен, которые хотите конвертировать в рубли, " + 
       " или введите \"stop\" для прекращения: ");
        list[k] = input.nextDouble();
        userString = input.next();
    	  if (userString.equalsIgnoreCase("stop")){
    	   System.out.print("Вы вышли из программы. ");
    	   contin = false;
    	  } else {
    	   japan_yen = Double.parseDouble(userString);
      	   if (japan_yen < 0) {
      	    System.out.println("Введите неотрицательное количество валюты. ");
      	    j++;
           } else {
             if (japan_yen >= 11 && japan_yen <= 20 || japan_yen >= 111 && japan_yen <= 114) {
              System.out.print(japan_yen + " японских йен равняются ");
              
             } else if (japan_yen % 10 == 1) {
              System.out.print(japan_yen + " японская йена равняется ");
              
             } else if (japan_yen % 10 > 1 && japan_yen % 10 <= 4) {
              System.out.print(japan_yen + " японских йены равняются ");
              
             } else {
              System.out.print(japan_yen + " японских йен равняются ");
              
             }
             roubles = find_roubles(japan_yen);
    	     }
    	  }  
    	 k--;
    	 i++;
      } while (contin && k >= 1);

      

      if (i >= 11 && i <= 20 || i >= 111 && i <= 114) {
        System.out.print("Произведено " + i + " конвертаций валюты. Из них ");
      } else if (i % 10 == 1) {
        System.out.print("Произведено " + i + " конвертацию валюты. Из них ");
      } else if (i % 10 > 1 && i % 10 <= 4) {
        System.out.print("Произведено " + i + " конвертации валюты. Из них ");
      } else {
       System.out.print("Произведено " + i + " конвертаций валюты. Из них ");
      }
      
      
    
    	if (j >= 11 && j <= 20 || j >= 111 && j <= 114) {
        System.out.print(j + " раз было введено отрицательное значение.");
      } else if (j % 10 == 1) {
        System.out.print(j + " раз было введено отрицательное значение.");
      } else if (j % 10 > 1 && j % 10 <= 4) {
        System.out.print(j + " раза было введено отрицательное значение.");
      } else {
        System.out.print(j + " раза было введено отрицательное значение.");
      }

    }

  public static double find_roubles(double japan_yen){
    roubles = japan_yen * ROUBLES_PER_YEN;
    roubles = (int)(roubles * 100 + 0.5) / 100.0;
    System.out.println(roubles + " российским рублям.");

    return roubles;
  }    
     
    	
      	
        
}     	