package Project;
class Project {
    static int n1;
    static int n2;
    public static void main(String[]args){
        
        n1 = 64;
        n2 = 180;
        commonDivisor(n1, n2);
        System.exit(0);
    }
    public static void commonDivisor(int n1, int n2){
        int divisor = 1;
        if (n1 > n2){
            divisor = n1;
        } else {
            divisor = n2;
        }
        
        do {
            if (n1 % divisor == 0  && n2 / divisor == 0)
                break;
            divisor--;
        } while (divisor > 1);
        System.out.println("Наибольший общий делитель введенных чисел: "+
        divisor + ".");
    }
    
}
