package Project;

public class ComputeFibonacci {
    public static void main(String[] args){
        
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Введите индекс числа Фибоначчи: ");
        int index = in.nextInt();
        System.out.println("Число Фибоначчи с индексом " + index + " равно: " + fib(index));
        


    }

    public static int fib(int index){
        int[] fib = new int[index + 1];
        fib[0] = 0;
        fib[1] = 1;
        if (index >=0 && index <= 1){
            return fib[index];
        } else{
            for(int i = 2; i < fib.length; i++){
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            return fib[index];
        }
        
        

    }
}
