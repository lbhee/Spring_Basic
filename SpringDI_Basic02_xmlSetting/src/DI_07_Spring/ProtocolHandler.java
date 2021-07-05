package DI_07_Spring;

import java.util.List;

public class ProtocolHandler {
	   private List<MyFilter> filters;
	   
	   //filters  getter , setter
	    public List<MyFilter> getFilters(){
	    	return this.filters;
	    }
	    
	    public void setFilters(List<MyFilter> filters) {
	    	this.filters = filters;
	    }
	
	   //검증 함수
	    public int fileter_length() {
	    	return this.filters.size();
	    }
	
}
