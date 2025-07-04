package org.example.E20;

public class Programmer extends Developer{

    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, "Programmer", programmingLanguage);
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.12;
    }

    @Override
    public String performanceReports() {
        return "Performance report"+getName()+" Good";
    }
    public void debugCode(){
        System.out.println("Programmer "+getName()+" is debugging code in"+getProgrammingLanguage());

    }
}
