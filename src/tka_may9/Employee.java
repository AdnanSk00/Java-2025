package tka_may9;

import java.io.Serializable;

public class Employee implements Serializable{			// implements Serializable - interface
//	Serializable - Having no any mathod so it is called marker interface
		int id;
		String name;
		 transient double salary;		// hide means store data at another place
		
		public Employee() {
			
		}

		public Employee(int id, String name, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
}
