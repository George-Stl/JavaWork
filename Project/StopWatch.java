package Project;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;
    StopWatch(){   //конструктор
    }
    public long getStartTime() {
        return startTime;
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public void getElapsedTime(){
        System.out.println(endTime - startTime);

    }





    public static void main(String[] args) {
        System.out.println("Отсчет начался ");
        StopWatch time = new StopWatch();
        time.start();
        System.out.println("Время начала в мс: " + time.getStartTime());
        int[][]list = new int[100][100];
        for(int row = 0; row < list.length; row++){
            for(int column = 0; column < list[0].length; column++){
                list[row][column] = (int)(Math.random() * 101);
            }
        }
        for (int row = 0; row < list.length; row++){
            Arrays.sort(list[row]);
        }
        System.out.print("\nОтсортированный массив:\n");
        for(int row = 0; row < list.length; row++) {
            for (int column = 0; column < list[0].length; column++) {
                System.out.print(list[row][column] + " ");
            }
            System.out.println();
        }
        time.stop();
        System.out.print("Затраченное время: ");
        time.getElapsedTime();


        ;












    }
}
