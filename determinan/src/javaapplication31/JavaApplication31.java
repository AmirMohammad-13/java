package javaapplication31;

public class JavaApplication31 {

    public static void main(String[] args) {
   
        int [][]a=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int n=a.length;
        int det=0;
        
        if (n==1){
            det=a[0][0];
        }
        
        else if(n==2){
            det=a[0][0]*a[1][1]-a[0][1]*a[1][0];
        }
       
        else if(n==3){
            det=a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])
               -a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])
               +a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);     
        }
       
        System.out.println("determinan barabare "+det+" mibashad");
    }
    
}
