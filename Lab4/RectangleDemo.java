/**
 * Write a description of class Lab3 here.
 * 
 * @ YISAH ABUBAKAR ALIYU U16/FNS/CSC/2101
 */
   public class RectangleDemo {
public static void main(String[] args) {
Rectangle rectangle = new Rectangle(20.0, 10.0);
double area = rectangle.area();
System.out.println("The area of the rectangle is\t" + area + " square cm");
System.out.println("The length of the rectangle is\t" + rectangle.getLength() +" cm");
rectangle.setLength(12.0);
System.out.println("The new length of the rectangle is " +rectangle.getLength() + " cm");
System.out.println("The new area of the rectangle is " + rectangle.area() + "square cm\n\n");
}

}
