public class moveZeros {
    public static void main(String[] args) {
        int[] a={1,0,2,5,0,3,2};
        int[] result;
        moveZeros obj=new moveZeros();
        result=obj.movin(a);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public int[] movin(int[] a){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0 && a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(a[j]!=0){
                j++;
            }
        }
        return a;
    }
}
