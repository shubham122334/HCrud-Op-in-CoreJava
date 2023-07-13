

import domain.P;
import model.Pservice;


public class AutoIdGeneration {

    private  Pservice pservice;

    
    AutoIdGeneration(Pservice pservice){
    	this.pservice=pservice;

    }
    
    public static void main(String[] arg){
    	AutoIdGeneration h=new AutoIdGeneration(new PserviceImpl());
    P p=new P();
    p.setFirstName("shubham");
    p.setLastName("prajapati");

    h.pservice.save(p);
	
    P p1=new P();
    p1.setFirstName("Karan");
    p1.setLastName("sharma");

    h.pservice.save(p1);


	System.out.println(h.pservice.findById(2L));
	
	for(P k:h.pservice.findAll())
    System.out.println("saved data-> "+k);

    }
    
}

