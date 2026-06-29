package curriculum.j;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hoursWorked) {
        if (hoursWorked <= 8) {
            return hoursWorked * 1250;
        } else {
            return (8 * 1250) + ((hoursWorked - 8) * (int)(1250 * 1.25));
        }
    }
}