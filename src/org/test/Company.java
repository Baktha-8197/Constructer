package org.test;

public class Company {
public Company() {
	this("Chennai");
    System.out.println("Company Name is Tata Consultancy Service");
}
public Company(String companyLocation) {
	this(1);
	System.out.println("Company location is "+companyLocation);
}
public Company(int companyRank) {
	System.out.println("Company rank is "+companyRank);
}
}
