package lecturesHomework.L23.E2;

public class Fabric {
    public Worker offer(int salary, int experience) {
        if (salary >= 500 && salary <= 1000) {
            return new Junior(salary, experience);
        } else if (salary > 1000 && salary <= 2000) {
            return new Middle(salary, experience);

        } else if (salary > 2000 && salary <= 5000) {
            return new Senior(salary, experience);
        }
        return new Junior(salary, experience);
    }

}
