package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContainerPackage {
    public static void container(ArrayList<Integer> list){
        ArrayList<Integer> copy = new ArrayList<>();
        copy.addAll(list);
        ArrayList<Integer> pack = new ArrayList<>();
        int count = 1; // счетчик контейнеров
        for(int i = 0; i < copy.size(); i++){
            int result = 10;
            result -= copy.get(i);
            int memory = copy.get(i);
            pack.add(copy.get(i));
            copy.remove(i);

            while(copy.size() > 0 && result >= Collections.min(copy)){
                if(copy.contains(result)){

                    pack.add(result);
                    //System.out.println("Размер списка: " + copy);
                    copy.remove(copy.get(copy.indexOf(result)));
                    memory += result;
                    result = 10 - memory;
                } else result--;
            }
            System.out.println("Контейнер " + count +
                    " содержит элементы с весом: " + pack);
            i--;
            count++;
            pack.clear();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите предметы весом до 10 (последний элемент 0): ");
        Scanner input = new Scanner (System.in);
        int value = input.nextInt();
        while(value != 0){
            list.add(value);
            value = input.nextInt();
        }
        System.out.println("Предметы: " + list);
        System.out.println("Распределить по контейнерам: ");
        container(list);

    }
}
