package Strings;
import java.util.*;
public class Pallindrome {
    public static boolean pallindrome_string(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.err.println(pallindrome_string(str));
    }
}
