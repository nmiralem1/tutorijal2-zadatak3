package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static boolean isDouble(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public static void main( String[] args ) throws Exception {
        List<Double> l = new ArrayList<Double>();
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite brojeve u listu, za prestanak unosa napišite \"stop\": ");
        String x = ulaz.nextLine();
        while(true){
            if(x.equals("stop")) {break;}
            else if (isDouble(x)){
                Double broj = new Double(x);
                l.add(broj);
            }
            x = ulaz.nextLine();
        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();
        try {
            System.out.println("Max = " + Matematika.max(l));
            System.out.println("Mean = " + Matematika.mean(l));
            System.out.println("Devijacija = " + Matematika.deviation(l));
            System.out.println("Min = " + Matematika.min(l));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}