package lt.gb;

import android.app.Activity;
import android.util.DisplayMetrics;

public class BaseManager {

	private Activity context;
	private DisplayMetrics metrics;
	private static BaseManager instance;
	
	public DisplayMetrics getMetrics(){
		return this.metrics;
	}
	
	public void setActivity(Activity act){
		this.context = act;
	}
	
	private BaseManager(){
	}
	
	public static BaseManager getInstance(){
		if(instance == null){
			instance = new BaseManager();
		}
		return instance;
	}

	public void init() {
		
		metrics = new DisplayMetrics();
		context.getWindowManager().getDefaultDisplay().getMetrics(metrics);
	
	}
	
	
}
