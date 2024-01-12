package Project;


public class A {
    int i = 5;
    static int k = 2;
    static int j;

    public static void main(String[] args) {
        A a = new A();
        j = a.i; // Допустимо: a.i обращается к переменной экземпляра
        a.m1(); // Допустимо: a.m1() вызывает метод экземпляра

       // System.out.println("\n" + a);
       // System.out.println("\n" + a.m2(a.i, j));
    }

    public void m1() {

        i = i + k + m2(i, k);
        System.out.println(i);
    }

    public static int m2(int i, int j) {
        return (int)(Math.pow(i, j));
    }
}