package javaapplication28;

 import java.util.Scanner; 

public class JavaApplication28 {

   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("enter a number: ");
       int n=input.nextInt();
       if (n<=0){
           System.out.println("adad mosbat vared konid");
       return;
       }
    
   int tedad=0;
   int sum=0;
   int majmoo=0;
   
   System.out.print("maghsomolayh: ");
   
   for(int i=1; i<=n; i++){
   if (n%i==0){
   tedad++;
   sum+=i;
   
   System.out.print(i+" ");
   
   if(i!=n){
   majmoo+=i;
}
}
}
   System.out.println("number of tedad: "+tedad);
   System.out.println("sum of number: "+sum);
   
   if (tedad==2){
   System.out.println("number is aval");
   System.out.println("maghsomoalayhha barabare 1 va "+n);
}else{
   System.out.println("number is not aval");
 
   for (int i=2; i<n; i++){
   if (n%i==0){
   System.out.println(i+" ");
}
}
}
   if (majmoo==n){
   System.out.println("adad kamel ast");
}else{
   System.out.println("adad kamel nist");
}
  
   }
}

   
          
    

