package Project;

import java.util.ArrayList;

public class ShuffleMethod {

    public static void shuffle(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            int j;
            do{
                j = (int) (Math.random() * list.size());
            }while(j == i);
            Integer buffer = list.get(i);
            list.set(i, list.get(j));
            list.set(j, buffer);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(90);
        list.add(72);
        System.out.println("Список до перетасовки: " + list);
        shuffle(list);
        System.out.println("Список после перетасовки: " + list);
    }

}

