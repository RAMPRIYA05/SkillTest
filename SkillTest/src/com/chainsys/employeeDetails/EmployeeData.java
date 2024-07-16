package com.chainsys.employeeDetails;

public class EmployeeData {
        public EmployeeData() {
        	
        }
         
        int id;
        String name;
        String designation;
        double salary;
        
        
        
		public EmployeeData(int id, String name, String designation, double salary 
				) {
			super();
			this.id = id;
			this.name = name;
			this.designation = designation;
			this.salary = salary;
			
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
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "EmployeeData [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
					+ "]";
		}
		
		
        
        
}
