import java.util.*;
public class validpalindrom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String s2 = "";
        char arr[] = new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i);
        }
        char arr2[] = {'!','@','$','%','^','&',',',';',':','*','<','>','/','?','.','(',')','{','}','[',']',' '};
        int count =0;
        for(int i = 0;i<s.length();i++){
            for(int j=0;j<arr2.length;j++){
                if(arr[i]!=arr2[j]){
                    count = 1;
                }
                else{
                    count = 0;
                    break;
                }
            }
            if(count == 1){
                s2 = s2+arr[i];
            }
        }
        String s3 = "";
        for(int i=s2.length()-1;i>=0;i--){
            s3 = s3 + s2.charAt(i);
        }
        if(s2.equals(s3)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
