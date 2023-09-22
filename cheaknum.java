import java.util.Scanner;
class sample{  
         public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number:");
           int number=sc.nextInt();
          
           if(number%3==0 && number%7==0 ){
           
              System.out.println("yes");
               }
             else{
                  System.out.println("no");
            }
         }
     }
             
