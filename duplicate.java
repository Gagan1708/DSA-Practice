import java.util.*;
public class duplicate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a[] = new int[s];
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<s-1;i++){
            for(int j=i+1;j<s;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
