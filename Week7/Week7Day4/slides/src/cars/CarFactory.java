package cars;

import cars.Model.FordModel;
import cars.Model.HondaModel;
import cars.Model.ToyotaModel;

public class CarFactory {
	public static Model CreateFactory(ModelNames name) {
		Model d = null;
	    
	    if (name == null)
	      return null;
	    
	    switch(name)
	    {
	      case FORD:
	        d = new FordModel();
	        break;
	      case HONDA:
	        d = new HondaModel();
	        break;
	      case TOYOTA:
	        d = new ToyotaModel();
	        break;
	      default:
	        // no op
	    }
	    return d; 
	}
}
