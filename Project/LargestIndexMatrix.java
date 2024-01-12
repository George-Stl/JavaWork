package Project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class LargestIndexMatrix {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(Math.random() < 0.5){
                    matrix[i][j] = 0;
                } else matrix[i][j] = 1;
            }
        }
        System.out.println("\nМатрица: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> listRow = new ArrayList<>();


        for(int i = 0; i < matrix.length; i++){
            int maxValue = 0;
            for(int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    maxValue++;
                }
            }
            listRow.add(maxValue);
        }
        ArrayList<Integer> listColumn = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int maxValue = 0;
            for(int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1) {
                    maxValue++;
                }
            }
            listColumn.add(maxValue);
        }
        System.out.println("Список listRow: " + listRow);
        System.out.println("Список listColumn: " + listColumn);
        ArrayList<Integer> indexRow = new ArrayList<>();
        for(int i = 0; i < listRow.size(); i++){
            if(listRow.get(i) == Collections.max(listRow)){
                indexRow.add(new Integer(i));
            }

        }
        ArrayList<Integer> indexColumn = new ArrayList<>();
        for(int i = 0; i < listColumn.size(); i++){
            if(listColumn.get(i) == Collections.max(listColumn)){
                indexColumn.add(new Integer(i));
            }

        }
        System.out.println("Индексы строк с наибольшим количеством единиц: " +
                indexRow);
        System.out.println("Индексы столбцов с наибольшим количеством единиц: " +
                indexColumn);
    }

}
