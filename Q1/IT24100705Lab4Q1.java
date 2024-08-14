import java.util.Scanner;
public class IT24100705Lab4Q1

{
    public static void main(String[] args)
    {
int number;
 Scanner input = new Scanner(System.in);
 System.out.println("Enter a number: ");
 number =input.nextInt();
 
 if(number<0) {
System.out.println("The number is: Negative");
}
else if(number>0) {
System.out.println("The number is: Positive");
}
else
{ 
System.out.println("The number is Zero");

}


    }
}