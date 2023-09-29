import java.util.Scanner;
 
   class sample{
                 
                public static void main(String[] args){
            
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter length and breath");
                double length=sc.nextDouble();
                double breadth=sc.nextDouble();
                
                 if(length==breadth){
                   System.out.println("it is a square");
                   }
                 
                 else{
                        System.out.println("Not square");
                     }
        }
    }