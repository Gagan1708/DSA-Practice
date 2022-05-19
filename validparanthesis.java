import java.util.*;
public class validparanthesis {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = new char[s.length()];
        char arr2[] = new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                arr[i] = s.charAt(i);
            }
            else if(s.charAt(i)==')'){
                arr2[i] = '(';
            }
            else if(s.charAt(i)=='}'){
                arr2[i] = '{';
            }
            else{
                arr2[i] = '[';
            }
        }
        String s1 = "";
        String s2 = "";
        for(int i=0;i<arr.length;i++){
            s1 = s1 + arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            s2 = s2 + arr2[i];
        }
        if(s1.equals(s2)){
            System.out.println("Valid Paranthesis");
        }
        else{
            System.out.println("Invalid Paranthesis");
        }
    }
}
