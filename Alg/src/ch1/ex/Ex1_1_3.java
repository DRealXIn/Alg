package ch1.ex;

import libs.In;
import libs.StdIn;
import libs.StdOut;

public class Ex1_1_3 {
    public static void main(String[] args) {
        int a,b,c;
        a=StdIn.readInt();
        b=StdIn.readInt();
        c=StdIn.readInt();
        if((a==b)&&(b==c)){
            StdOut.println("equal");
        }
        else{
            StdOut.println("not equal");
        }
    }
}
