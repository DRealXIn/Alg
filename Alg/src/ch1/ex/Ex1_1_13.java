package ch1.ex;

import libs.StdOut;

public class Ex1_1_13 {
    public static <E> void transpose(E [][] a){
        for(int j=0;j<a[0].length;j++){
            for(int i=0;i<a.length;i++){
                StdOut.print(a[i][j]);
                StdOut.print(" ");
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        Integer[][]a={{1,2,3},{4,5,6}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                StdOut.print(a[i][j]);
            }
            StdOut.println();
        }
        transpose(a);
        String [][] b={{"a","b","c"},{"d","e","f"}};
        transpose(b);
    }
}
