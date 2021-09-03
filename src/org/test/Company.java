package org.test;

public class Company {
public Company() {
	this("Chennai");
    System.out.println("Company Name is Tata Consultancy Service");
}
public void add() {
	System.out.println("add");
}
private void subtract() {
System.out.println("Subtract");
}
public Company(String companyLocation) {
	this(1);
	System.out.println("Company location is "+companyLocation);
}
public Company(int companyRank) {
	System.out.println("Company rank is "+companyRank);
}
}
