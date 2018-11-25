package pl.mwaleria.cci.ch01;

public class Task01_08 {

    public static boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        String bigString = s1+s1;
        return bigString.indexOf(s2) >=0 ;
    }
}
