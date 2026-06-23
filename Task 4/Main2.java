
abstract class TeamMember {
    protected String name;
    public TeamMember(String name){
        this.name= name;
    }
    

}
interface BonusEligible{
    void calculateBonus();

}
class Employee extends TeamMember implements BonusEligible{
    public Employee(String name){
    super(name);
}
@Override
public void calculateBonus(){
    System.out.println("calculating standard employee bonus...");
}
}
class Contractor extends TeamMember {
    public Contractor(String name){
        super(name);
    }
    public void work(){
        System.out.println("Contractor is working on a project.");
    }
}
public class Main2{
    public static void main(String[] args) {
        Employee emp = new Employee("John");
        Contractor con = new Contractor("Alice");
        emp.calculateBonus();
        con.work();
    }
}

