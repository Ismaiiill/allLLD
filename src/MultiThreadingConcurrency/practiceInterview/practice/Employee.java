package src.MultiThreadingConcurrency.practiceInterview.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    int id;
    String name;
    String department;
    double salary;
    int experience;

    public Employee(int id, String name, String department, double salary, int experience) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

}

class Implementaion{
    //all implementation
    private String id;
    private List<Employee> list=new ArrayList<>();

    public String addEmployee(Employee employee){
        list.add(employee);
        return employee.getId()+" added";
    }

    public Boolean removeEmployee(int id){
        System.out.println("removing employee with "+id);
//        return this.list.removeIf(employee -> employee.getId()==id);
//        Employee employee=list.stream().filter(employee2->employee2.getId()==id).findFirst().orElse(null);
        Optional<Employee> employee=list.stream().filter(employee2->employee2.getId()==id).findFirst();
        employee.ifPresent(list::remove);
        return employee.isPresent();
    }
    public Boolean updateSalary(int id,double salary){
        System.out.println("updating the salary for id..."+id);
        Employee employee=this.list.stream().filter(employee1 -> employee1.getId()==id).findFirst().orElse(null);
        if (employee==null) return false;
        else {
            employee.setSalary(salary);
            return true;
        }
    }
    public Employee getHighestPaidEmployee(){
        return this.list.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
    }

    public List<Employee> getTopNHighestPaidEmployees(int n){
        list.sort(Comparator.comparingDouble(Employee::getSalary));
        return this.list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(n)
                .toList();
    }

    public List<Employee> getEmployeesByDepartment(String department){
        return this.list.stream()
                .filter(employee -> employee.getDepartment()==department)
                .toList();
    }
    public Map<String,Double> averageSalaryByDepartment(){
        Map<String,Double>map=new HashMap<>();
        map=list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        return map;
    }
    public List<Employee> sortByExperiance(){
//        1st type
//        return list.stream().sorted(Comparator.comparingInt(Employee::getExperience).reversed()).toList();

//        2nd type
//        return list.stream().sorted((e1,e2)->Integer.compare(e1.getExperience(),e2.getExperience())).toList();
//        3rd way
        return list.stream().sorted(Comparator.comparingInt(Employee::getExperience)
                .thenComparing(
                        Comparator.comparingDouble(Employee::getSalary)
                ))
                .toList();


    }

    public static void main(String[] args) {


    }
}
