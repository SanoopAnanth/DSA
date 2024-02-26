package Matrix;
import java.util.*;
public class prg1 {
    public void maxElementInSort(int matrix[][],int n, int x){
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            if(matrix[i][j]==x){
                System.out.println("Element found at "+i+" and "+j+" .");
                return;
            }
            if(matrix[i][j]>x){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        prg1 obj=new prg1();
        int matrix[][]=new int[4][4];
        // matrix[0][0]=10;
        // matrix[0][1]=20;
        // matrix[0][2]=30;
        // matrix[0][3]=40;
        // matrix[1][0]=15;
        // matrix[1][1]=25;
        // matrix[1][2]=35;
        // matrix[1][3]=45;
        // matrix[2][0]=27;
        // matrix[2][1]=29;
        // matrix[2][2]=37;
        // matrix[2][3]=48;
        // matrix[3][0]=32;
        // matrix[3][1]=33;
        // matrix[3][2]=39;
        // matrix[3][3]=51;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        obj.maxElementInSort(matrix,matrix.length, 32);
    }
}
