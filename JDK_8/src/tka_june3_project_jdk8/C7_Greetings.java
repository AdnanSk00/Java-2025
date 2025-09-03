package tka_june3_project_jdk8;

// Government - CellularTeleCom
public interface C7_Greetings {		// functional interface
	
//	void greet();		// abstract
	
	void greet(String s);		// abstract
	
//	void offer();				// lambda func() doesnt work on two abstract method.
}

//	A class having only one abstract method is called 'Functional Interface'.
//  Lambda function() work with or support only functional interface.