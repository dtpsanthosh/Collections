package defaultpackage;

import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<Employee> e=new ArrayList<>();
		e.add(new Employee("gummani",10));
		e.add(new Employee("gummani",20));
		for(Employee emp:e) {
			System.out.print("Employee Details:");
			System.out.println(emp.getName()+":"+emp.getNo());
		}
	}

}
