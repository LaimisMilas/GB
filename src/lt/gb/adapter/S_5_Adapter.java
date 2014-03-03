package lt.gb.adapter;

import lt.gb.PageItem;
import lt.gb.f.F_5_1;
import lt.gb.f.F_5_2;
import lt.gb.f.F_5_3;
import lt.gb.f.F_5_4;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

// Adapteris turi buti atskirai kitaip neveikia
public class S_5_Adapter extends B_S_Adapter {
	
	public S_5_Adapter(FragmentManager fm, PageItem[] list) {
		super(fm);
		this.list = list;
		TAG = 'e';
	}

	@Override
	public int getCount() {
		return super.getCount();
	}

	@Override
	public Fragment getItem(int position) {

		String index = list[position].getIndex();

		if (index.equals("5_1")) {
			F_5_1 f = new F_5_1(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		if (index.equals("5_2")) {
			F_5_2 f = new F_5_2(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		if (index.equals("5_3")) {
			F_5_3 f = new F_5_3(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}
		
		if (index.equals("5_4")) {
			F_5_4 f = new F_5_4(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		return null;
	}

	@Override
	public float getPageWidth(int position) {
		return super.getPageWidth(position);
	}
}
