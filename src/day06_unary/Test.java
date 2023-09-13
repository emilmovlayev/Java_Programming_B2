package day06_unary;

public class Test {
    public static void main(String[] args) {
        int i = 5;
        int z = ++i;
        System.out.println(z);
        System.out.println(i);

        int a = 5;
        int b = i++;
        System.out.println(z);
        System.out.println(i);
    }
}
