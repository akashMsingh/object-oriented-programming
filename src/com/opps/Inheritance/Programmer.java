package com.opps.Inheritance;

class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Programmer", programmingLanguage);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.12;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance report for Programmer " + getName() + ": Excellent";
    }

    public void debugCode() {
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
    }
} 