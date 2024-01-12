package Project;

import java.util.Arrays;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars){
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }
    public int length(){
        return this.chars.length;
    }
    public char charAt(int index){
        return this.chars[index];
    }
    public MyString1 substring (int begin, int end){
        char[] subChar = new char[end -begin];
        for (int i = begin, k = 0; i < end; i++, k++){
            subChar[k] = this.chars[i];
        }
        return new MyString1(subChar);
    }
    public MyString1 toLowerCase(){
        char[] lowerChar = new char[this.chars.length];
        for(int i = 0; i < this.chars.length; i++){
            lowerChar[i] = Character.toLowerCase(this.chars[i]);
        }
        return new MyString1(lowerChar);
    }
    public static MyString1 valueOf(int i){
        char[] valueChars = new char[40];
        int count = 0;
        while(i != 0){
            int k = i % 10;
            i /= 10;
            valueChars[count] = (char)('0' + k);
            count++;
        }
        char[] newValueChars = new char[count];
        for(int l = count - 1; l >= 0; l--){
            newValueChars[l] = valueChars[count - l - 1];
        }
        return new MyString1(newValueChars);
    }
    public char[] toChars(){//getter- метод
        return this.chars;
    }
    public boolean equals(MyString1 obj){
        return obj != null && Arrays.equals(this.chars, obj.toChars());
    }

    public static void main(String[] args) {
        MyString1 myString = new MyString1(new char[]{'1', '2', 'D'});
        System.out.print("Строка : ");
        for(int i = 0; i < myString.toChars().length; i++) {
            System.out.print(myString.toChars()[i] + " ");
        }
        System.out.println("\nДлина строки: " + myString.length());
        System.out.println("Метод charAt(index 2): " + myString.charAt(2));
        System.out.print("Метод substring(1, 3): ");
        char[] charSub = myString.substring(1, 3).toChars();
        for(int i = 0; i < charSub.length; i++){
            System.out.print(charSub[i] + " ");
        }
        System.out.println();
        System.out.print("Метод toLowerCase: ");
        MyString1 toLowerString = myString.toLowerCase();
        char[] toLowerChar = toLowerString.toChars();
        for(int i = 0; i < toLowerChar.length; i++){
            System.out.print(toLowerChar[i] + " ");
        }
        System.out.println();

        MyString1 valueString = MyString1.valueOf(123456);
        System.out.print("Метод valueOf(int 123456): ");
        for(int i = 0; i < valueString.toChars().length; i++){
            System.out.print(valueString.toChars()[i] + " ");
        }
        System.out.println();
        int k = 123456;
        MyString1 myString1 = new MyString1(new char[]{'1', '2', 'D'});
        System.out.println("Метод equals(MyString1 {'1', '2', 'D'}: " + myString.equals(myString1));
    }
}
