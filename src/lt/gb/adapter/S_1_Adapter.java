package lt.gb.adapter;

import lt.gb.PageItem;
import lt.gb.f.F_1_1;
import lt.gb.f.F_1_2;
import lt.gb.f.F_1_3;
import lt.gb.f.F_1_4;
import lt.gb.f.F_2_1;
import lt.gb.f.F_2_2;
import lt.gb.f.F_2_3;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

// Adapteris turi buti atskirai kitaip neveikia
public class S_1_Adapter extends B_S_Adapter {

	public S_1_Adapter(FragmentManager fm, PageItem[] list) {
		super(fm);
		this.list = list;
		TAG = 'a';
	}

	@Override
	public int getCount() {
		return super.getCount();
	}

	@Override
	public Fragment getItem(int position) {

		String index = list[position].getIndex();

		if (index.equals("1_1")) {
			F_1_1 f = new F_1_1(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		if (index.equals("1_2")) {
			F_1_2 f = new F_1_2(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}

		if (index.equals("1_3")) {
			F_1_3 f = new F_1_3(list[position]);
			Bundle args = new Bundle();
			f.setArguments(args);
			return f;
		}
		
		if (index.equals("1_4")) {
			F_1_4 f = new F_1_4(list[position]);
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
