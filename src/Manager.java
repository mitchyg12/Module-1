public class Manager extends Employee {
    private String department;
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Department: " + this.department);
    }
}