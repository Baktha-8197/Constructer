package org.test;

public class Employee extends Client{
public Employee() {
	this("Kallakurichi");
System.out.println("Employee name is Bakthavachalam");
}
public Employee(String employeeLocation) {
	this(1234);
	System.out.println("Employee location is Chennai");
}
public Employee(int employeeId) {
	System.out.println("Employee id is  " +employeeId);
}
public static void main(String[] args) {
	Employee e=new Employee();
}
}
