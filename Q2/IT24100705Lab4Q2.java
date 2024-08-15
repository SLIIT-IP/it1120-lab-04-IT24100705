import java.util.Scanner;
public class IT24100705Lab4Q2{
    public static void main(String[] args){
    	double examMarks,labMarks,examPrecentage,labPrecentage,finalExamMarks;
    	Scanner input= new Scanner(System.in);
    	System.out.println("Please enter exam marks");
    	examMarks= input.nextDouble();
       	if (0>examMarks || examMarks>100){
 		System.out.println("Invalid input for exam marks. Terminating program.");
		System.exit(0);
	}
    	System.out.println("Please enter lab submission marks");
    	labMarks= input.nextDouble();
        if (0>labMarks || labMarks>100){
 		System.out.println("Invalid input for lab submission marks.Terminating program.");
		System.exit(0);
	

        }
        System.out.println("Please enter the precentage given for the exam");
    	examPrecentage= input.nextDouble();
        System.out.println("Please enter the precentage given for the lab submission");
    	labPrecentage= input.nextDouble();
	if(examPrecentage+labPrecentage==100){
		finalExamMarks=examMarks*examPrecentage/100+labMarks*labPrecentage/100;
        System.out.println("Final Exam Mark is :"+finalExamMarks);
	}
        else{
		System.out.println("The precentages must add up to 100. Terminating program.");
		System.exit(0);
	}
        
        
        
        
    }
}