package Package2;
import Package3.IBonus;
public class Teacher extends Employee implements IBonus{
public Teacher(String i, double s) {
super(i, s);
}
public void print_value(){
System.out.println("Teacher ID:"+id);
System.out.println("Basic Salary is:"+salary); 
}
@Override
public void get_eid_Bonus() {
System.out.println("Salary and Bonus will be:"+salary*.15);
}
    
}
