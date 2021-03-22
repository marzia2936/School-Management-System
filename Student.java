package Package2;
import java.util.Scanner;
public class Student {
int id;
String name;
double cgpa;
public void  setvalue(){
System.out.println("Input Student id");
Scanner input = new Scanner(System.in);
id = input .nextInt();
System.out.println("Input Student name");
input.nextLine();
name = input.nextLine();
}  
public void printvalue(){
System.out.println("Student ID: "+id); 
System.out.println("Student Name: "+name);
}
public double cgpaCalculation(double cgpa1){
cgpa= cgpa1;
System.out.println("Student CGPA = "+cgpa1);
return cgpa1;
}
          
}
