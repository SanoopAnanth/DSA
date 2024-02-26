package Matrix;

import java.util.Scanner;

public class prg2 {
    public void spiralPrint(int[][] matrix,int r,int c){
        int i,k=0,l=0;
        while(k<r && l<c){
            for(i=l;i<c;i++){
                System.out.println(matrix[k][i]);
            }
            k++;
            for(i=k;i<r;i++){
                System.out.println(matrix[i][c-1]);
            }
            c--;
            if(k<r){
                for(i=c-1;i>=l;i--){
                    System.out.println(matrix[r-1][i]);
                }
            }
            r--;
            if(l<c){
                for(i=r-1;i>=k;i--){
                    System.out.println(matrix[i][l]);
                }
            }
            l++;
        }
    }
    public static void main(String[] args) {
        prg2 obj=new prg2();
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[4][4];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The spiral order is");
        obj.spiralPrint(matrix, matrix.length, matrix.length);
    }
}
