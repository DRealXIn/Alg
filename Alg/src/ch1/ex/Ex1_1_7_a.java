package ch1.ex;

import libs.StdOut;

public class Ex1_1_7_a {
    public static void main(String[] args) {
        double t=9.0;
        while(Math.abs(t-9.0/t)>.001)
            t=(9.0/t+t)/2.0;
        StdOut.printf("%.5f\n",t);
    }
}
