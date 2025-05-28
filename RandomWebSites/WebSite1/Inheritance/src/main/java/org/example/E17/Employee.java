package org.example.E17;

public class Employee extends Person{
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getLastName(){

        return "GET "+super.getLastName()+" "+employeeTitle;
    }
    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public Employee(String name,String lastName,int employeeId,String employeeTitle){
        super(name,lastName);
        this.employeeId = employeeId;
        this.employeeTitle = employeeTitle;
    }
    private int employeeId;
    private String employeeTitle;

}
