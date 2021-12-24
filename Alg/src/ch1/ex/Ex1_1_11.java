package ch1.ex;

import libs.StdOut;

public class Ex1_1_11 {
    public static void printBoolArray(boolean[][] a){
        StdOut.print(" ");
        for(int i=0;i<a[0].length;i++){
            StdOut.print(i);
        }
        StdOut.println();
        int j=0;
        for(boolean[] b:a){
            StdOut.print(j);
            for(boolean c:b){
                if(c==true){
                    StdOut.print("*");
                }
                else{
                    StdOut.print(" ");
                }
            }
            StdOut.println();
            j++;
        }
    }

    public static void main(String[] args) {
        boolean[][] a={{true,true,true},{true,true,true},{true,true,true}};
        printBoolArray(a);
    }
}
