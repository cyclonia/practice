package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {
	
	public static List<Employee> createEmployees(){
	
		return Arrays.asList(new Employee(1, "Sunil"),
				new Employee(2,  "Anil"),
				new Employee(3,  "Alex"));
	}
	
	public static void main(String[] args) {
		
		List<Employee> employees = createEmployees();
		
		employees.stream().map(Employee::getId).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		employees.stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		employees.stream().sorted((o1,o2)-> o2.getId() - o1.getId()).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
