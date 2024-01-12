package Project;

import java.util.Scanner;

public class TutorialSortListBank{
    public static void main(String[]args){
        int numberOfRecords;
        Object[][] clients;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество клиентов: ");
        numberOfRecords = input.nextInt();

        clients = new Object[numberOfRecords][4];

        for (int row = 0; row < clients.length; row++){
            System.out.print("Введите фамилию: ");
            clients[row][0] = input.next();

            System.out.print("Введите имя: ");
            clients[row][1] = input.next();

            System.out.print("Введите отчество: ");
            clients[row][2] = input.next();

            System.out.print("Введите сумму на счете: ");
            clients[row][3] = input.nextDouble();
        }
        
        for (int i = 0; i < clients.length; i++){
            for(int row = 0; row < clients.length - 1; row++){
                double firstString = (Double)clients[row][3];
                double secondString = (Double)clients[row + 1][3];
                if(firstString > secondString){
                    swap(clients, row, row + 1);
                }
            }

        }


        System.out.println("Данные клиентов в порядке увеличения баланса счета: ");
        for (int i = 0; i < clients.length; i++){
            System.out.print(clients[i][0] + " ");
            System.out.print(clients[i][1].toString().substring(0, 1) + ". ");
            System.out.print(clients[i][2].toString().substring(0, 1) + ". ");
            System.out.println(clients[i][3]);
        }
    }
    
    static void swap(Object[][]list, int i, int j){
        for(int k = 0; k < list[i].length; k++){
            
            Object buff = list[i][k];
            list[i][k] = list[j][k];
            list[j][k] = buff;
                        
        }
    }

}