package services;

import domen.Employee;
import domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServise implements iPersonService<Employee> {
    private int count;
    private List<Employee> employeeList;

        public EmployeeServise() {
        this.employeeList = new ArrayList<Employee>();
    }
    private void sortByFIO(){
        PersonComparator<Employee> comparator = new PersonComparator();
        this.employeeList.sort(comparator);
    }
    @Override
    public List<Employee> getAll() {
        return this.employeeList;
    }

    @Override
    public void create(String name, int age) {
        Employee newEmployee = new Employee(name,age,"разнорабочий");
        this.employeeList.add(newEmployee);
        this.count++;
    }
}
