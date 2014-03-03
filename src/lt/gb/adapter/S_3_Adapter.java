package lt.gb.adapter;

import lt.gb.PageItem;
import lt.gb.f.F_3_1;
import lt.gb.f.F_3_2;
import lt.gb.f.F_3_3;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

// Adapteris turi buti atskirai kitaip neveikia
public class S_3_Adapter extends B_S_Adapter {
	
	public S_3_Adapter(FragmentManager fm, PageItem[] list) {
		super(fm);
		this.list = list;
		TAG = 'c';
	}

	@Override
	public int getCount() {
		return super.getCount();
	}

	@Override
	public Fragment getItem(int position) {

		String index = list[position].getIndex();

		if (index.equals("3_1")) {
			F_3_1 f = new F_3_1(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		if (index.equals("3_2")) {
			F_3_2 f = new F_3_2(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		if (index.equals("3_3")) {
			F_3_3 f = new F_3_3(list[position]);
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
