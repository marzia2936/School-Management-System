package Package1;
import Package2.*;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
             
        // This is Student class. Here will be inputed and also printed student,id,name,cgpa
        Student s1 = new Student();
        s1.setvalue();
        s1.printvalue();
        System.out.println("Enter Student CGPA");
        Scanner input= new Scanner(System.in);
        double cg = input.nextDouble();
        s1.cgpaCalculation(cg);
        //Here Teacher object can see her id & salary &Salary+Bonus.Her eid bonus is 15%        
        Teacher t1 = new Teacher("E123-456",2000000);
        t1.print_value();
        t1.get_eid_Bonus();
         //Here Admin object can see her id & salary &Salary+Bonus.Her eid bonus is 20%        
        Admin a1 = new Admin("E123-456",2000000);
        a1.print_value();
        a1.get_eid_Bonus();
    
    
    
    
    
    
     }
    
    
      
            
            
            
            
    
}
