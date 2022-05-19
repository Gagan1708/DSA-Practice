import java.util.*;
public class removecon {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String s2 = "";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != s.charAt(i+1)){
                s2 = s2 + s.charAt(i);
            }
        }
        s2 = s2 + s.charAt(s.length()-1);
        System.out.println(s2);
    }
}
