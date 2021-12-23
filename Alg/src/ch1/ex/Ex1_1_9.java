package ch1.ex;

public class Ex1_1_9 {
    public static String toBinaryString(int n){
        String s="";
        while(n!=0){
            s=(n%2)+s;
            n=n/2;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(toBinaryString(1));
        System.out.println(toBinaryString(5));
    }
}
