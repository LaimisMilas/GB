package lt.gb.adapter;

import lt.gb.PageItem;
import lt.gb.f.F_4_1;
import lt.gb.f.F_4_2;
import lt.gb.f.F_4_3;
import lt.gb.f.F_4_4;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

// Adapteris turi buti atskirai kitaip neveikia
public class S_4_Adapter extends B_S_Adapter {

	public S_4_Adapter(FragmentManager fm, PageItem[] list) {
		super(fm);
		this.list = list;
		TAG = 'd';
	}

	@Override
	public int getCount() {
		return super.getCount();
	}

	@Override
	public Fragment getItem(int position) {

		String index = list[position].getIndex();

		if (index.equals("4_1")) {
			F_4_1 f = new F_4_1(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		if (index.equals("4_2")) {
			F_4_2 f = new F_4_2(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		if (index.equals("4_3")) {
			F_4_3 f = new F_4_3(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		if (index.equals("4_4")) {
			F_4_4 f = new F_4_4(list[position]);
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
