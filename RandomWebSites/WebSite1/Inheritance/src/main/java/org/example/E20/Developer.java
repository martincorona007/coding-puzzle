package org.example.E20;

public class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name, String address, double salary, String jobTitle,String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return super.calculateBonus()*0.10;
    }

    @Override
    public String performanceReports() {
        return "Performance report"+getName()+" Good";
    }
    public void writeCode(){
        System.out.println("Developer "+getName()+" code in "+programmingLanguage);
    }
}
