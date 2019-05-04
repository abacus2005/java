/**
 * Write a description of class Lab3 here.
 * 
 * @ YISAH ABUBAKAR ALIYU U16/FNS/CSC/2101
 */
import java.util.Scanner;
public class PseudocodeA
{
 public static void main(String[]arg){
     int grade;
     double average;
     int total=0;
     int counter=1;
    Scanner input = new Scanner(System.in);
    while(counter<=10){
    System.out.println("Enter enter next grade");
    grade=input.nextInt();
    total=total+grade;
    counter=counter+1;
}
    average = total/10;
    System.out.println("The class avarage: "+average);
}
}
