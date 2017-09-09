package com.santhoshonjava.spring.beans;

public class Employee {

	private int employeeId;
	
	private String empName;
	
	public Employee(){
		
	}
	public Employee(int employeeId,String empName){
		this.employeeId = employeeId;
		this.empName = empName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + "]";
	}
	
	
	
}
