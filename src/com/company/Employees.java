package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;

public class Employees {
    private ArrayList<Employee> employees;

    public Employees () {
        employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
        sortByLastName();
    }

    public void remove(String lastName) {
        for(int i = 0; i<employees.size();i++) {
            if(employees.get(i).getLastName().equals(lastName)) {
                employees.remove(employees.get(i));
                break;
            }
        }
    }

    public void sortByLastName() {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                char[] alphabet = {'a', 'b', 'c','d','e','f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'l','o','p','q','r','s', 't','u','v','w','x','y','z'};
                int result =0;
                for(int i =0; i<Math.min(o1.getLastName().length(), o2.getLastName().length());i++) {
                    int indexInAlphabet1 = getIndexOfCharInCharArray(alphabet, o1.getLastName().toLowerCase(Locale.ROOT).charAt(i));
                    int indexInAlphabet2 = getIndexOfCharInCharArray(alphabet, o2.getLastName().toLowerCase(Locale.ROOT).charAt(i));
                    if(indexInAlphabet1>indexInAlphabet2) {
                        result = 1;
                        break;
                    }
                    if(indexInAlphabet1<indexInAlphabet2) {
                        result = -1;
                        break;
                    }
                }
                return result;
            }
        });
    }

    public void print() {
        for(Employee employee : employees) {
            System.out.println(employee.getLastName()+" "+employee.getPhoneNumber()+" "+employee.getDay()+"."+employee.getMonth()+"."+employee.getYear());
        }
        System.out.println();
    }

    public void sortByDateOfBirth() {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int result = 0;
                if(o1.getYear()>o2.getYear()) result = 1;
                if(o1.getYear()<o2.getYear()) result = -1;
                if(o1.getYear()==o2.getYear()) {
                    if(o1.getMonth()<o2.getMonth()) result = 1;
                    if(o1.getMonth()>o2.getMonth()) result = -1;
                    if(o1.getMonth()==o2.getMonth()) {
                        if(o1.getDay()<o2.getDay()) result = 1;
                        if(o1.getDay()>o2.getDay()) result = -1;
                        if(o1.getDay()==o2.getDay()) result = 0;
                    }
                }
                return result;
            }
        });
    }

    private int getIndexOfCharInCharArray(char[] array,char ch) {
        int result = 0;
        for (int i = 0; i<array.length;i++) {
            if(ch==array[i]) {
                result = i;
            }
        }
        return result;
    }
}
