package mockito_demo;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness1 {

	public ToDoService doService;  
	  
    public ToDoBusiness1(ToDoService doService) {  
        this.doService = doService;  
    }  
      
    public List<String> getTodosforHibernate(String user) {  
          
        List<String> hibernatelist = new ArrayList<String>();  
        List<String> Combinedlist = doService.getTodos(user);  
          
        for(String todo: Combinedlist) {  
            if(todo.contains("Hibernate")) {  
                hibernatelist.add(todo);  
            }  
        }  
          
        return hibernatelist;  
        }  
}
