import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import domain.St;

public abstract class AbstractImpl <T extends St,ID>{

    private Map<Long ,T> map=new HashMap<>();
    T save(T object){

        if(object!=null){
            if(object.getId()==null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }else{
            throw new RuntimeException("object not found");
        }
        return object;
    }

    T findById(ID id){
        return map.get(id);
    }

    private Long getNextId(){

        Long nextId=null;
        try{
        nextId= Collections.max(map.keySet())+1;
        } catch (NoSuchElementException e) {
            nextId=1L; 
        }
        return nextId;
    }

	Set<T> findAll() {
		// TODO Auto-generated method stub
		
		return new HashSet<>(map.values());
	}

}
