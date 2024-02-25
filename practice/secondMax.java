import java.util.*;
public class secondMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        secondMax obj=new secondMax();
        int result=obj.secon(a);
        System.out.println("Second Max value is"+" "+result);
        sc.close();
    }
    public int secon(int []arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
