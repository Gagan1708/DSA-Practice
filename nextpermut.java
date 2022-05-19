import java.util.*;
public class nextpermut{
    public static void nextPermutation(int a[]){
        if(a.length == 1){
            System.out.println(a[0]);
            return;
        }
        int i = a.length-2;
        while(i>=0 && a[i]>=a[i+1]) i--;
        if(i>=0){
            int j = a.length-1;
            while(a[j] <= a[i]) j--;
            swap(a,i,j);
        }
        reverse(a,i+1,a.length-1);
    }
    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void reverse(int a[], int i, int j){
        while(i<j) swap(a,i++,j++);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a[] = new int[s];
        for(int i=0;i<s;i++){
            a[i] = sc.nextInt();
        }
        nextPermutation(a);
        for(int i=0;i<s;i++){
            System.out.print(a[i]+" ");
        }
    }
}