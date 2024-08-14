import java.util.Scanner;
public class IT24100705Lab4Q3

{
    public static void main(String[] args)
    {
int number;
String result;
 Scanner input = new Scanner(System.in);
 System.out.println("Enter a number: ");
 number =input.nextInt();
 
result = (number<0) ? "The number is: Negative":
         (number>0) ? "The number is: Positive":
         "The number is Zero";
System.out.println(result);


    }
}