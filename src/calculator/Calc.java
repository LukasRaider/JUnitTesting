package calculator;

public class Calc {
    public int Secti(int a,int b) {
        return a + b ;
    }
    public int Odecti(int a,int b) {
        return a - b ;
    }
    public double Nasob(double a,double b) {
        return a * b ;
    }
    public double Del(double a,double b) {
        return a / b ;
    }
    public int SectiOdDo(int a, int b) {
        int result = a;

        for (int i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }
    public static String Pole(int[] pole) {
        // Kontrola, zda je pole prázdné
        if (pole.length == 0) {
            return "Pole je prázdné";
        }

        // Kontrola, zda je každý prvek v poli celé číslo
        for (int prvek : pole) {
            if (!(prvek instanceof Integer)) {
                return "Některý prvek není celé číslo";
                if(prvek instanceof Integer){}
            }

        }

        return "Všechny prvky jsou celá čísla";
    }
}
