package com.bptn.course._hackDayFriday.employee;

class Employee {
    // Instance variable to store salary
    private double salary;

    // Instance variable to store hours per day worked by employee
    private int hoursPerday;

    // Constructor to set instance variables(salary and hoursPerDay) value
    public Employee(double salary, int hoursPerday) {
        setSalary(salary);
        setHoursPerday(hoursPerday);
    }

    // Set method to update salary
    public void setSalary(double salary) {
        if (salary < 500) {
            this.salary = salary+10;
        }
        else this.salary = salary;
    }

    // Set method to update hoursPerDay
    public void setHoursPerday(int hoursPerday) {
        if (hoursPerday > 6) {
            this.salary = salary + 5;
        }
        else this.hoursPerday = hoursPerday;
    }


    // Get method to return salary
    public double getSalary() {
        return salary;
    }
}

