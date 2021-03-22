package Package1;
import Package2.Employee;
import Package3.IBonus;
public class Admin extends Employee implements IBonus{
Admin(String i,double s){
super(i,s);
}
public void print_value(){
System.out.println("Admin ID:"+id);
System.out.println("Basic Salary is:"+salary);
 
}
@Override
public void get_eid_Bonus() {
System.out.println("Salary and Bonus will be:"+salary*.20);
}
  
}
