import java.util.Scanner;
class sample{
         public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
          System.out.println("Enter num1");
          int num1=sc.nextInt();
          System.out.println("Enter num2");
          int num2=sc.nextInt();
          System.out.println("Enter num3");
          int num3=sc.nextInt();
          
           int largest=num1;
           int smallest=num1;
          
          if(num2>largest){
           largest=num2;
           }
          if(num3>largest){
           largest=num3;
          }
         if(num2<smallest){
            smallest=num2;
           }
         if(num3<smallest){
           smallest=num3;
          }
           System.out.println("largest num is:"+largest);
           System.out.println("Smallest num is:"+smallest);
           
           }
      }
          

          


            

   
          
        
      