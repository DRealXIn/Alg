package ch1.ex;

import libs.StdOut;

public class Ex1_1_15 {
    public static int[] histogram(int a[],int M){
        int[] b=new int[M];
        for(int i=0;i<M;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    b[i]++;
                }
            }
        }
        return b;

    }

    public static void main(String[] args) {
        int sum=0;
        int[] b={1,2,3,4,5,6,1,2};
        int[] a=histogram(b,10);
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        StdOut.println(sum+" "+b.length);
    }
}
