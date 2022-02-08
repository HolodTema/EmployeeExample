package com.company;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivanov", "88005553535", 22, 03, 1998);
        Employee emp2 = new Employee("Grishkin", "8908638373", 5, 11,1980);
        Employee emp3 = new Employee("Sidorov", "8914765229", 4, 4, 1969);
        Employees employeesList = new Employees();

        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(emp3);

        employeesList.print();

        employeesList.sortByDateOfBirth();
        employeesList.print();
        employeesList.remove("Ivanov");
        employeesList.print();
    }
}
