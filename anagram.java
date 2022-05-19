import java.util.*;
public class anagram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i);
        }
        String t = sc.nextLine();
        char arr2[] = new char[t.length()];
        for(int i=0;i<t.length();i++){
            arr2[i] = t.charAt(i);
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(Arrays.equals(arr, arr2)){
            System.out.println("It is an Anagram");
        }
        else{
            System.out.println("It is not an Anagram");
        }
    }
}
