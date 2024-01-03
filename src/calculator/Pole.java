package calculator;

public class Pole {

    public double getMin(double[] input){

                double min = input[0];
        for(int i =0;i<input.length;i++) {
            if(input[i]<min){ min = input[i];}
        }
        return min;
    }
    public double getMax(double[] input){
        double max = 999999999.9;
        for(int i =0;i<input.length;i++) {
            if(input[i]>max){ max = input[i];}
        }
        return max;
    }
    public double getSame(double[] input){
        double result = input[0];
        int convert;
        for(int i = 0;i<input.length;i++) {
            if(input[i]==result){ convert = 0;}
        }
        return convert;
    }

}
