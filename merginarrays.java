import java.util.*;
public class MergingArrays {
      public int[] merg(int []a1,int []b1,int []c1){
          int i,j,k;
          i=j=k=0;
          int m1=a1.length;
          int n1=b1.length;
          while(i<m1&&j<n1){
         if(a1[i]<=b1[j])c1[k++]=a1[i++];
         else c1[k++]=b1[j++];
          }
          for(;i<m1;i++){
              c1[k++]=a1[i];
          }
            for(;j<n1;j++){
              c1[k++]=b1[j];
          }
            return c1;
      }
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter dimensions of arr1  a");
       int m=sc.nextInt();
        System.out.println("enter dimensions of arr1  b");
       int n=sc.nextInt();
       
       int a[] =new int[m];
       int b[] =new int[n];
       int c[] =new int[m+n];
       System.out.println("enter 1st array");
       
       for(int i=0;i<m;i++){
           a[i]=sc.nextInt();
       }
       System.out.println("Array 1 input completed ");
        System.out.println("enter 2 nd array");
         for(int i=0;i<n;i++){
           b[i]=sc.nextInt();
       }
          System.out.println("Array 2 input completed ");
         MergingArrays ma=new MergingArrays();
         int result[]=ma.merg(a,b,c);
         for(int x:result){
                     System.out.print(x+" ");

         }
          System.out.println(); 
         System.out.print(Arrays.toString(result)); 
       
    }
    
}
