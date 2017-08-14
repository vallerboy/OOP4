/**
 * Created by Lenovo on 14.08.2017.
 */
public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    protected void makeVoice() {
        System.out.println("Jestem szarym pracownikiem");
    }
}
