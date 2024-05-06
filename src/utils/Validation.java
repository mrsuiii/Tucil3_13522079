package utils;

public class Validation {
    // static method
    // mengecek apakah panjang String s1 dan s2 sama
    public static boolean val_length(String s1,String s2){
        return s1.length()==s2.length();
    }
    // mengecek apakah perbedaan huruf pada string berjumlah 1
    public static boolean is_different1(String s1,String s2){
        if(!val_length(s1, s2)){
            return false;
        }
        int diff = 0;
        int length = s1.length();
        for(int i=0;i<length;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                diff++;
            }
        }
        return diff==1;
    }
    



}
