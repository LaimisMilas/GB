package lt.gb;

import lt.gb.f.TestNLayout;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainGBActivity extends FragmentActivity {

	boolean created;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		BaseManager.getInstance().setActivity(this);
		BaseManager.getInstance().init();
		
		setContentView(R.layout.activity_main_gb);
		
		if (savedInstanceState != null
				&& savedInstanceState.containsKey("created")) {
			created = savedInstanceState.getBoolean("created");
		}
		
		if(!created){
			
		//	TestNLayout mainFragment = new TestNLayout();
			MainFragment mainFragment = new MainFragment();
			FragmentManager fm  = this.getSupportFragmentManager();
			FragmentTransaction ft = fm.beginTransaction();
			ft.replace(R.id.fragment_layout, mainFragment, TestNLayout.TAG);
			ft.commit();
			fm.executePendingTransactions();
		}
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putBoolean("created", true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main_gb, menu);
		return true;
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

}
