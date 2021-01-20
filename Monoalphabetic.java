import java.util.Scanner;
public class Monoalphabetic{
    public static StringBuffer p = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
    public static StringBuffer ci =  new StringBuffer("qazwsxedcrfvtgbyhnujmiklop");
    public static StringBuffer encrypt(String s){
        StringBuffer c = new StringBuffer();char ch = '\0' ;
        for (int i = 0; i < s.length(); i++){
            for ( int j = 0; j < 26; j++){
                if (p.charAt(j) == s.charAt(i))
                {
                    ch = ci.charAt(j);
                    c.append(ch);
                    break;
                }
            }
        }
        return c;
    }
     public static StringBuffer decrypt(String s){
        StringBuffer c = new StringBuffer();
        char ch =  '\0';
        for (int i = 0; i < s.length(); i++){
            for ( int j = 0; j < 26; j++){
                if (ci.charAt(j) == s.charAt(i))
                {
                    ch = p.charAt(j);
                    c.append(ch);
                    break;
                }
            }
        }
        return c;
    }
     public static void main(String [] args){
        String p = "tashisherpa"; 
        System.out.println(encrypt( p ));
        System.out.println(decrypt((encrypt( p )).toString()));
        System.out.println(CeasarCipher.encrypt( p , 2));
    }
    }

