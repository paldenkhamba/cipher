
public class CeasarCipher
{
    public static StringBuffer encrypt(String p, int key){
        StringBuffer c = new StringBuffer();
        for (int i = 0; i < p.length(); i++){
            if(Character.isUpperCase(p.charAt(i))){
                char ch = (char)(((int)p.charAt(i) + key - 65) % 26 +65);
                c.append(ch);
            }
            else{
                char ch = (char)(((int)p.charAt(i) + key - 97) % 26 +97);
                c.append(ch);   
            }
        }
        return c;
    }
    public static StringBuffer decrypt(String p, int key){
        StringBuffer c = new StringBuffer();
        for (int i = 0; i < p.length(); i++){
            if(Character.isUpperCase(p.charAt(i))){
                char ch = (char)(((int)p.charAt(i) - key - 65) % 26 + 65);
                 c.append(ch); 
            }
            else{
                char ch = (char)(((int)p.charAt(i) - key - 97) % 26 +97);
                c.append(ch);
            }
        } 
        return c;
    }
    public static void main(String [] args){
        String p = "tashisherpa";  int key = 12;
        System.out.println(encrypt( p , key ));
        System.out.println (decrypt((encrypt( p , key )).toString(), key));}
    }
       
