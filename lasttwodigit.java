import java.util.Scanner;
    class sample{
               public static void main(String[] args){
               Scanner sc= new Scanner(System.in);
               System.out.println("Enter number:");
               int num=sc.nextInt();
               System.out.println("Last two digit of a number:"+(num%100));
          
              }
      }