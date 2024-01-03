package calculator;

public class Calc {
    public int Secti(int a,int b) {
        return a + b ;
    }
    public int Odecti(int a,int b) {
        return a - b ;
    }
    public double Odecti(double a,double b) {
        return a - b ;
    }
    public double Nasob(double a,double b) {
        return a * b ;
    }
    public double Del(double a,double b) {
        return a / b ;
    }
    public double SectiOdDo(int a, int b) {
        int soucet;
        if (a>b) {
            throw new IllegalArgumentException("Prvni cislo musi byt mensi");
        }
        else {
            soucet = 0;
            for (int i = a; i <= b; i++) {
                soucet+=i;
            }
        }
        return soucet;
    }

}
