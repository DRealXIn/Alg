package ch1.ex;

import libs.StdOut;

public class Ex1_1_14 {
    public static int lg(int N){
        int s=1;
        int a=0;
        for(int i=0;i<=N;i++){
            if(i==0)
                ;
            else{
                s=s*2;
            }
            if(s>N){
                a=i-1;
                break;

            }
            else if(s==N){
                a=i;
                break;
            }
        }
        return a;

    }

    public static void main(String[] args) {
        StdOut.println(lg(100));
    }
}
