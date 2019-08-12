package com.prasanna.employee.tracker;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Test {
	
	static Map<Employee, EntryLog> attendence = new HashMap<>();
	
	public static void main(String[] args) throws Exception {
		
		Employee e1 = new Employee(1,"A");
		Employee e2 = new Employee(2,"B");
		Employee e3 = new Employee(3,"C");
		Employee e4 = new Employee(4,"D");
		
		
		attendence.put(e1, new EntryLog(0,0));
		attendence.put(e2, new EntryLog(0,0));
		attendence.put(e3, new EntryLog(0,0));
		attendence.put(e4, new EntryLog(0,0));
		
		Test t = new Test();
		t.logIn(e1);
		t.logIn(e2);
		t.logIn(e3);
		t.logIn(e4);
		
		
		t.logOut(e1);
		t.logOut(e2);
		t.logOut(e3);
		t.logOut(e4);
		
		System.out.println(t.getAttendence(e1));
		System.out.println(t.getAttendence(e2));
		System.out.println(t.getAttendence(e3));
		System.out.println(t.getAttendence(e4));
		
		getEmployeeDetails(1);
	
		
	}
	
	static Set<Employee> set = attendence.keySet();
	
	private static void getEmployeeDetails(int empId) {
		for(Employee e:set) {
			if(e.getEmpId()==empId) {
				System.out.print(e);
				System.out.println(attendence.get(e));
			}
		}
	}
				
	private void logIn(Employee e) throws Exception {
		
		if(!attendence.containsKey(e)) {
			throw new Exception("Employee inValid");
		}
		else {
			attendence.get(e).setLogIn(System.currentTimeMillis()/1000);;
		}
	}
	
	private void logOut(Employee e) throws Exception {
		
		if(!attendence.containsKey(e)) {
			throw new Exception("Employee inValid");
		}
		else {
			attendence.get(e).setLogOut(System.currentTimeMillis()/1000);
		}
	}
	
	private int getAttendence(Employee e) throws Exception {
		
		if(!attendence.containsKey(e)) {
			throw new Exception("Employee inValid");
		}
		else {
			return attendence.get(e).workHours(attendence.get(e).getLogIn(), attendence.get(e).getLogOut());
		}
	}
	
}
