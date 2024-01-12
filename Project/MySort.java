package Project;

import java.util.ArrayList;
import java.util.Collections;

public class MySort {
    public static void sort(ArrayList<Integer> list){
        ArrayList<Integer> sortedList = new ArrayList<>();
        int size = list.size();
        do{
            sortedList.add(list.remove(list.indexOf(Collections.min(list))));
        }while(sortedList.size() < size);
        //System.out.println("Отсортированный список: " + sortedList);
        //System.out.println("Размер массива list: " + list.size());
        list.addAll(sortedList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i ++){
            list.add((int)(Math.random() * 11));
        }
        System.out.println("Список: " + list);
        sort(list);
        System.out.println("Отсортированный список: " + list);
    }
}
