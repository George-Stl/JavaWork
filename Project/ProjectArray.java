package Project;

import java.util.Scanner;

public class ProjectArray {

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

      for(int l = 0; l < list.length; l++){
    	System.out.print("Введите количество японских йен, которые хотите конвертировать в рубли: ");
        list[l] = input.nextDouble();
        if (list[l] < 0) {
      	    System.out.println("Введите неотрицательное количество валюты. ");
      	    j++;
        }    
      }
      convertArray(list);
      }  
  public static void convertArray(double[]list){
    for(int l = 0; l< list.length; l++){
        
    }

  }
}  
    	  
    	  