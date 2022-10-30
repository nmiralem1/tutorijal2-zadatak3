package ba.unsa.etf.rpr;

import java.util.List;

import static java.lang.Math.abs;

public class Matematika {
    public static Double min(List<Double> l) throws Exception {
        if(l.size()==0) { throw new Exception("Prazna lista"); }
        double x = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) < x) x = l.get(i);
        }
        return x;
    }
    public static Double max(List<Double> l) throws Exception {
        if(l.size()==0) { throw new Exception("Prazna lista"); }
        double x = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) > x) x = l.get(i);
        }
        return x;
    }
    public static Double mean(List<Double> l) throws Exception {
        if(l.size()==0) { throw new Exception("Prazna lista"); }
        double suma=0;
        for(int i = 0; i < l.size(); i++){
            suma+=l.get(i);
        }
        return suma/l.size();
    }
    public static Double deviation(List<Double> l) throws Exception {
        if(l.size()==0) { throw new Exception("Prazna lista"); }
        double suma=0,mi=mean(l);
        for(int i=0;i<l.size();i++){
            suma+=(mi-l.get(i))*(mi-l.get(i));
        }
        suma/=l.size();
        return Math.sqrt(suma);
    }
}