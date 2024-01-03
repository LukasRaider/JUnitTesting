package calculator;

public class PoleDovnitrPoleVen {
    public String[] vratSubPole(String[] pole) {
        String[] s = new String[pole.length];
        int j=0;
        for (int i = 0; i < pole.length; i++) {
            if(pole[i].startsWith("a")) {
                s[j]=pole[i];
                j++;
            }
        }
        return s;
    }
}
