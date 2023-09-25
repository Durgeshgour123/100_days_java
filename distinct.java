import java.util.Scanner;
class sample{
public static void main(String args[]){
 
	Scanner sc = new Scanner(System.in);
  	System.out.println("subject 1 marks = ");
	int x= sc.nextInt();
	System.out.println("subject 2 marks= ");
	int y= sc.nextInt();
	System.out.println("subject 3 marks = ");
	int z = sc.nextInt();
	
if(x>=75)
	System.out.println("distinct subject number is : "+x);
if(y>=75)
	System.out.println("distinct subject number is : "+y);
if(z>=75) 
	System.out.println("distinct subject number is : "+z);
        

    }
}