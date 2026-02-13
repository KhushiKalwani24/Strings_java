package Strings;
import java.util.*;
public class creation {
    
    public static void printString(String str){
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       // char arr[]={'a','b','c','d'};
        //String str = "abcd";
        //String str2 = new String("xyz");

        //String are IMMUTABLE 

        //Scanner sc = new Scanner(System.in);
        //String name;
        //name= sc.nextLine();
        //System.out.println(name);

        //String fullName = "Tony Stark";
        //System.out.println(fullName.length());

        //conctnation
        String firstName="Shradha";
        String lastName="Khapra";
        String fullName= firstName + " " + lastName;
        printString(fullName);
    }
}
