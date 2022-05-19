import java.util.*;
public class searchsort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a[] = new int[s];
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for(int i=0;i<s;i++){
            if(a[i]==key){
                System.out.println("Found at index "+i);
            }
        }
    }
}
