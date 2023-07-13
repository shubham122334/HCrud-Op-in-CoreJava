import java.util.Set;

import domain.Employee;
import model.PersonService;

public class PersonServiceImpl extends AbstractImpl<Employee ,Long> implements PersonService{

	@Override
	public Employee save(Employee object) {
		
		return super.save(object);
	}

	@Override
	public Employee findById(Long id) {
		
		return (Employee)super.findById(id);
	}

	@Override
	public Set<Employee> findAll() {
		
		return super.findAll();
	}

	@Override
	public void delete(Employee object) {
	
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		
		super.deleteById(id);
		
	}



	
    
}
 