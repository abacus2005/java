/**
 * Write a description of class Lab3 here.
 * 
 * @ YISAH ABUBAKAR ALIYU U16/FNS/CSC/2101
 */
import java.util.Scanner;
public class StudentDemo
{
    public static void main(String[] args){
        String name;
        int idNumber;
        double quiz1,quiz2,quiz3;
        Scanner input=new Scanner(System.in);
        System.out.print("\n\nEnter Student name: ");
          name=input.nextLine();
            System.out.print("Enter Student ID: ");
             idNumber=input.nextInt();
               System.out.print("Enter Quiz1 score: ");
                quiz1=input.nextDouble();
                  System.out.print("Enter Quiz2 score: ");
                   quiz2=input.nextDouble();
        System.out.print("Enter Quiz3 score: ");
            quiz3=input.nextDouble();
              Student stud=new Student(name,idNumber,quiz1,quiz2,quiz3);
                stud.printDetails();
        System.out.print("\nAverage: "+stud.getAverage());
         System.out.print("\n\nEnter new score for quiz3: ");
          quiz3=input.nextDouble();
           stud.setQuizThree(quiz3);
            stud.printDetails();
        System.out.print("\nAverage: "+stud.getAverage());
    }
}
