package com.yedam.study;

public class ParentExample {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.name="hong";
		showInfo(p);
//		Child c = new Child();
//		c.name = "hwang";
//		c.age = 10;
		showInfo(new Parent() {
			int age;
			int getAge() {
				return age;
			}
			@Override
			String getName() {
				String newName = "Hwang";
				return super.getName();
			}
			
		});//END OF showInfo();
		
		EmpService empService = new EmpServiceImpl();
		getEmp(empService);
		getEmp(new EmpService() {

			@Override
			public void getEmployee(int empId) {
				System.out.println("empId : " + empId);
			}
			
		});
	}//END of ParentExample class
	
	static void getEmp(EmpService emp) {
		emp.getEmployee(101);
	}
	static void showInfo(Parent p) {
		System.out.println(p.getName());
	}//END of showInfo
}
