import java.util.Set;

import domain.P;
import model.Pservice;

public class PserviceImpl extends AbstractImpl<P ,Long> implements Pservice{

	@Override
	public P save(P object) {
		
		return super.save(object);
	}

	@Override
	public P findById(Long id) {
		
		return (P)super.findById(id);
	}

	@Override
	public Set<P> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}



	
    
}
 