

import domain.Employee;
import model.PersonService;


public class AutoIdGeneration {

    private  PersonService personService;

    
    AutoIdGeneration(PersonService personService){
    	this.personService=personService;

    }
    
    public static void main(String[] arg){
    
    AutoIdGeneration h=new AutoIdGeneration(new PersonServiceImpl());
    
    Employee employee1=new Employee();
    employee1.setFirstName("Mary");
    employee1.setLastName("Kom");

    // saving 1st Employee
    h.personService.save(employee1);
	
    
    Employee employee2=new Employee();
    employee2.setFirstName("Karan");
    employee2.setLastName("sharma");

    //saving 2nd Employee 
    h.personService.save(employee2);
    
    
    Employee employee3=new Employee();
    employee3.setFirstName("Karan");
    employee3.setLastName("sharma");
    
    // saving 3rd Employee
    h.personService.save(employee3);
    
    
    Employee employee4=new Employee();
    employee4.setFirstName("Karan");
    employee4.setLastName("sharma");
    
    // saving 4th Employee
    h.personService.save(employee4);

    
    // finding  Employee by Id
    Employee em=h.personService.findById(3L); 
	System.out.println("Emplyee found = "+em);
	
	
	//deleting 2nd Employee 
	h.personService.delete(employee2);
	System.out.println("2nd Employee deleted.....");
	
	
	//deleting employee with id = 3
	h.personService.deleteById(3L);
	System.out.println("Employee with id -> 3 deleted.......");
	
	//finding All Employee in Db
	for(Employee k:h.personService.findAll())
    System.out.println("Employee Data -> "+k);
    }
    
}

